package com.wang.company.controller;

import com.wang.company.command.UserCommand;
import com.wang.company.model.User;
import com.wang.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {


  @Autowired
  UserService userService;

  @RequestMapping(value = "/user/list",method = RequestMethod.GET)
  public ResponseEntity<List<UserCommand>> commodityList(HttpServletRequest request) {
    List<UserCommand> userCommands = userService.findAll();
    return new ResponseEntity<List<UserCommand>>(userCommands,HttpStatus.OK);
  }

}
