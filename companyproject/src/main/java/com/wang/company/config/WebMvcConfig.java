package com.wang.company.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@Configuration @EnableWebMvc public class WebMvcConfig extends WebMvcConfigurerAdapter {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  WebMvcConfigurerAdapter#configureDefaultServletHandling(DefaultServletHandlerConfigurer)
   */
  @Override public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

}
