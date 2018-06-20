package com.wang.company.service;


import java.util.List;

import com.wang.company.command.UserCommand;
import com.wang.company.model.User;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public interface UserService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  List<UserCommand> findAll();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   name      DOCUMENT ME!
   * @param   passWord  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  User findByNameAndPassWord(String name, String passWord);
} // end interface UserService
