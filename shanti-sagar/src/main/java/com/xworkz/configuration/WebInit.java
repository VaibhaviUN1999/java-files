package com.xworkz.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	public WebInit()
	{
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("started getRootConfigClasses =====");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("started getServletConfigClasses----- ");
		Class[] ref= {ShantiConfig.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("started getServletMappings----- ");
		String[] ref= {"/"};
		return ref;
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("started configureDefaultServletHandling..............");
		configurer.enable();
		
	
	}
}
