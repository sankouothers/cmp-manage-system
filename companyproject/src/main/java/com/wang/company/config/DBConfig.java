package com.wang.company.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@ComponentScan("com.wang.company.model")
@Configuration
@EnableJpaRepositories("com.wang.company.repository")
@EnableTransactionManagement(proxyTargetClass = true)
@PropertySource("classpath:application.properties")
public class DBConfig {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final String DATABASE_DRIVER   = "spring.datasource.driver-class-name";
  private static final String DATABASE_URL      = "spring.datasource.url";
  private static final String DATABASE_USERNAME = "spring.datasource.username";
  private static final String DATABASE_PASSWORD = "spring.datasource.password";

  private static final String HIBERNATE_DIALECT = "spring.jpa.properties.hibernate.dialect";

  private static final String ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Resource private Environment env;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  // 数据源

  /**
   * dataSource.
   *
   * @return  DataSource
   */
  @Bean public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();

    dataSource.setDriverClassName(env.getProperty(DATABASE_DRIVER));
    dataSource.setUrl(env.getRequiredProperty(DATABASE_URL));
    dataSource.setUsername(env.getRequiredProperty(DATABASE_USERNAME));
    dataSource.setPassword(env.getRequiredProperty(DATABASE_PASSWORD));

    return dataSource;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * entityManager.
   *
   * @param   entityManagerFactory  EntityManagerFactory
   *
   * @return  EntityManager
   */
  @Bean
  @Qualifier(value = "entityManager")
  public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
    return entityManagerFactory.createEntityManager();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * entityManagerFactory.
   *
   * @return  LocalContainerEntityManagerFactoryBean
   */
  @Bean(name = "entityManagerFactory")
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

    factory.setJpaVendorAdapter(hibernateJpaVendorAdapter());
    factory.setDataSource(dataSource());
    factory.setPackagesToScan(env.getRequiredProperty(ENTITYMANAGER_PACKAGES_TO_SCAN));

    return factory;
  } // end method entityManagerFactory

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * hibernateJpaVendorAdapter.
   *
   * @return  HibernateJpaVendorAdapter
   */
  @Bean public HibernateJpaVendorAdapter hibernateJpaVendorAdapter() {
    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

    vendorAdapter.setGenerateDdl(Boolean.TRUE);
    vendorAdapter.setShowSql(Boolean.TRUE);
    vendorAdapter.setDatabasePlatform(env.getRequiredProperty(HIBERNATE_DIALECT));

    return vendorAdapter;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * transactionManager.
   *
   * @param   factory  EntityManagerFactory
   *
   * @return  PlatformTransactionManager
   */
  @Bean public PlatformTransactionManager transactionManager(EntityManagerFactory factory) {
    return new JpaTransactionManager(factory);
  }
} // end class DBConfig
