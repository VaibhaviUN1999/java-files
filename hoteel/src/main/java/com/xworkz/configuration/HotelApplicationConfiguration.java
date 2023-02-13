package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class HotelApplicationConfiguration {
	
	
	public HotelApplicationConfiguration() {
		System.out.println("Running HotelApplicationConfiguration");
	}

	@Bean
	public ViewResolver resolver() {
		  InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
    return  resolver;
	}
 
	@Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("registering LocalContainerEntityManagerFactoryBean");

		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();

		return bean;
	}

}