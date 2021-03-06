package com.wang.company.command;

/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public class LoginCommand extends ResponseCommand{
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String passWord;

  private String userName;

  /**
   * Creates a new ResponseCommand object.
   *
   * @param errorMessage DOCUMENT ME!
   */
  public LoginCommand(String errorMessage) {
    super(errorMessage);
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getPassWord() {
    return passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getUserName() {
    return userName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  passWord  DOCUMENT ME!
   */
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  userName  DOCUMENT ME!
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

} // end class LoginCommand
