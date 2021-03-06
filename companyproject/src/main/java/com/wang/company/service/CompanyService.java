package com.wang.company.service;


import java.util.List;

import com.wang.company.command.CompanyCommand;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public interface CompanyService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   companyCommand  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  String createCompany(CompanyCommand companyCommand);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  List<CompanyCommand> findAll();
}
