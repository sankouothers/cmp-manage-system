package com.wang.company.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wang.company.command.LoginCommand;
import com.wang.company.command.ResponseCommand;
import com.wang.company.model.User;
import com.wang.company.service.UserService;
import com.wang.company.util.Constants;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@RestController public class LoginController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   userCommand  DOCUMENT ME!
   * @param   request      DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  @RequestMapping(
    value  = "/login",
    method = RequestMethod.POST
  )
  public ResponseEntity<ResponseCommand> login(LoginCommand userCommand, HttpServletRequest request) {
    User user = userService.findByNameAndPassWord(userCommand.getUserName(), userCommand.getPassWord());

    if (user != null) {
      HttpSession session = request.getSession();
      session.setAttribute(Constants.USER_NAME_KEY, user.getName());
      session.setAttribute(Constants.USER_ID_KEY, user.getId());

      return new ResponseEntity<>(HttpStatus.OK);
    }


    return new ResponseEntity<>(new ResponseCommand("用户名或密码错误"), HttpStatus.OK);
  }

} // end class LoginController
