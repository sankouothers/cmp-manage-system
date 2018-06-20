package com.wang.company.service;


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
   * @param   name      DOCUMENT ME!
   * @param   passWord  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  User findByNameAndPassWord(String name, String passWord);

} // end interface UserService
