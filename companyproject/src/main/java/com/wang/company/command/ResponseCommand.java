package com.wang.company.command;

/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public class ResponseCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String errorMessage;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new ResponseCommand object.
   *
   * @param  errorMessage  DOCUMENT ME!
   */
  public ResponseCommand(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME! z
   *
   * @return  DOCUMENT ME!
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  errorMessage  DOCUMENT ME!
   */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
} // end class ResponseCommand
