package com.wang.company.command;

import com.wang.company.model.User;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public class CompanyCommand extends ResponseCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private User administrator;

  private Long   administratorId;
  private String administratorName;

  private Long id;

  private String name;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new CompanyCommand object.
   */
  public CompanyCommand() {
    super();
  }

  /**
   * Creates a new CompanyCommand object.
   *
   * @param  errorMessage  DOCUMENT ME!
   */
  public CompanyCommand(String errorMessage) {
    super(errorMessage);
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public User getAdministrator() {
    return administrator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Long getAdministratorId() {
    return administratorId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getAdministratorName() {
    return administratorName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

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
   * @param  administrator  DOCUMENT ME!
   */
  public void setAdministrator(User administrator) {
    this.administrator = administrator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  administratorId  DOCUMENT ME!
   */
  public void setAdministratorId(Long administratorId) {
    this.administratorId = administratorId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  administratorName  DOCUMENT ME!
   */
  public void setAdministratorName(String administratorName) {
    this.administratorName = administratorName;
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
} // end class CompanyCommand
