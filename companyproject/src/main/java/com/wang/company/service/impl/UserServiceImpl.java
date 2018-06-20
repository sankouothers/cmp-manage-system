package com.wang.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.wang.company.model.User;
import com.wang.company.repository.UserRepository;
import com.wang.company.service.UserService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@Service @Transactional public class UserServiceImpl implements UserService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired UserRepository userRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  com.wang.company.service.UserService#findByNameAndPassWord(java.lang.String, java.lang.String)
   */
  @Override public User findByNameAndPassWord(String name, String passWord) {
    User user;
    try{
      user = userRepository.findByNameAndPassWord(name, passWord);
    }catch (Exception e){
      return null;
    }
     return user;
  }
} // end class UserServiceImpl
