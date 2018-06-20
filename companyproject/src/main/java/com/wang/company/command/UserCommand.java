package com.wang.company.command;

/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public class UserCommand extends ResponseCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Long   id;
  private String name;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new UserCommand object.
   */
  public UserCommand() {
    super();
  }

  /**
   * Creates a new ResponseCommand object.
   *
   * @param  errorMessage  DOCUMENT ME!
   */
  public UserCommand(String errorMessage) {
    super(errorMessage);
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Long getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  id  DOCUMENT ME!
   */
  public void setId(Long id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  name  DOCUMENT ME!
   */
  public void setName(String name) {
    this.name = name;
  }
} // end class UserCommand
