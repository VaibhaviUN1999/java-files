package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.xworkz")
@Configuration
public class ShantiConfig {
	
	
	public ShantiConfig()
	{
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewresolver()
	{
		InternalResourceViewResolver src=new InternalResourceViewResolver("/",".jsp");
		return src;
	}
	
	
	

}
