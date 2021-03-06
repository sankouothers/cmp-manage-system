package com.wang.company.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wang.company.command.CompanyCommand;
import com.wang.company.service.CompanyService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@RestController public class CompanyController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired CompanyService companyService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   request  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  @RequestMapping(
    value  = "/company/list",
    method = RequestMethod.GET
  )
  public ResponseEntity<List<CompanyCommand>> commodityList(HttpServletRequest request) {
    List<CompanyCommand> companyCommands = companyService.findAll();

    return new ResponseEntity<>(companyCommands, HttpStatus.OK);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   companyCommand  DOCUMENT ME!
   * @param   request         DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  @RequestMapping(
    value  = "/company",
    method = RequestMethod.POST
  )
  public ResponseEntity<CompanyCommand> createCompany(CompanyCommand companyCommand, HttpServletRequest request) {
    String errorMessage = companyService.createCompany(companyCommand);

    return new ResponseEntity<>(new CompanyCommand(errorMessage), HttpStatus.OK);
  }

} // end class CompanyController
