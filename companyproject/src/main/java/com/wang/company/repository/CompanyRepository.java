package com.wang.company.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.wang.company.model.Company;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
public interface CompanyRepository extends CrudRepository<Company, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   name  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  @Query(
    value       = "SELECT EXISTS(SELECT 1 FROM company WHERE name=#{name})",
    nativeQuery = true
  )
  boolean findByName(@Param("name") String name);
}
