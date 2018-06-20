package com.wang.company.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.wang.company.command.CompanyCommand;
import com.wang.company.model.Company;
import com.wang.company.repository.CompanyRepository;
import com.wang.company.repository.UserRepository;
import com.wang.company.service.CompanyService;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@Service @Transactional public class CompanyServiceImpl implements CompanyService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** DOCUMENT ME! */
  @Autowired CompanyRepository companyRepository;

  /** DOCUMENT ME! */
  @Autowired UserRepository userRepository;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  com.wang.company.service.CompanyService#createCompany(com.wang.company.command.CompanyCommand)
   */
  @Override public String createCompany(CompanyCommand companyCommand) {
    boolean exists = companyRepository.findByName(companyCommand.getName());

    if (exists) {
      return "该公司名称已存在";
    }

    Company company = new Company();
    company.setName(companyCommand.getName());
    company.setAdministrator(userRepository.getById(companyCommand.getAdministratorId()));
    company.setCreateDate(new Date());

    return "";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  com.wang.company.service.CompanyService#findAll()
   */
  @Override public List<CompanyCommand> findAll() {
    List<CompanyCommand> companyCommands = new ArrayList<>();

    for (Company company : companyRepository.findAll()) {
      CompanyCommand command = new CompanyCommand();
      command.setId(company.getId());
      command.setName(company.getName());
      command.setAdministratorName(company.getAdministrator().getName());
      companyCommands.add(command);
    }

    return companyCommands;
  }

} // end class CompanyServiceImpl
