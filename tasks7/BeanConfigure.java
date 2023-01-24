package com.xworkz.bin;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.xworkz.config.Hardwareshop;
import com.xworkz.config.SoftwareEnginner;

@Configuration
@ComponentScan("package com.xworkz.config;")

public class BeanConfigure {

	@Bean
	public Integer ide()
	{
		System.out.println("generated id for hardware shop");
		int ide=100;
		return ide;

	}
	@Bean
	public String names()
	{
		System.out.println("generated name");
		String name="vai";
		return name;
	}
	@Bean
	public String gstNo11()
	{
		System.out.println("generated gstNo");
		String gstNo1="123456";
		return gstNo1;
	}
	@Bean
	public String ownerNames()
	{
		System.out.println("generated owner name");
		String name1 ="ganesha";
		return name1;
	}
	@Bean
	public String addresss()
	{
		System.out.println("generated address");
		return "nelamangala";
	}
	@Bean
	public String names1()
	{
		System.out.println("generated name");
		return "san";
	}
	@Bean
	public Double sal()
	{
		System.out.println("generated salary");
		Double ref=44.77;
		return ref;
	}
	@Bean
	public String companyNames()
	{
		System.out.println("generated company name");
		return "Wipro";
	}
	@Bean		
	public Integer expe()
	{
		System.out.println("generated exp");
		int i=10;
		return i;

	}

	@Bean
	public String namee()
	{
		System.out.println("generated name");
		return "seema";
	}
	@Bean
	public Double v()
	{
		System.out.println("generated type");

		return 22.33;
	}
	@Bean
	public String developer()
	{
		System.out.println("generated company name");
		return "vai";
	}
	@Bean		
	public LocalDate d()
	{

		return LocalDate.of(2023, 01, 11);

	}

	@Bean
	public Boolean free()
	{
		System.out.println("generated name");
		return true;
	}
	@Bean
	public String name11()
	{
		System.out.println("generated name");
		return "Apsara";
	}
    @Bean 
    public String type11()
    {
    	System.out.println("generated type");
    	return "pen-pencil";
    	
    }
    @Bean
    public int price11()
    {
    	System.out.println("generated price");
    	return 100;
    	
    }
    @Bean
    public String color()
    {
    	System.out.println("generated color");
    	return "pink";
    }
    @Bean
    public boolean sharp()
    {
    	System.out.println("generated sharp");
    	return true;
    }
    @Bean
    public boolean stolen()
    {
    	System.out.println("generated stolen");
    	return true;
    }
    @Bean
    public String name12()
    {
    	System.out.println("generated name");
    	return "natraj";
    }
    @Bean
    public String type12()
    {
    	System.out.println("generated eraser name");
    	return "non dust";
    }
    @Bean
    public Integer price12()
    {
    	System.out.println("eraser money is");
    	return 20;
    }
    @Bean
    public String color12()
    {
    	System.out.println("color of eraser is");
    	return "White";
    }
    @Bean
    public String shape12()
    {
    	System.out.println("shape of eraser is");
    	return "cube";
    }
    @Bean
    public Boolean stolen12()
    {
    	System.out.println("generated stolen");
    	return true;
    }
    @Bean
    public Double size()
    {
    	System.out.println("generated eraser size");
    	return 7.5;
    }
    @Bean
	public String movie()
	{
		System.out.println("generated movie name");
		return "kantara";
	}
	@Bean
	public double ratings()
	{
		System.out.println("generated type");

		return 92.33;
	}
	@Bean
	public String talkies()
	{
		System.out.println("generated company name");
		return "Manjunatha";
	}
	@Bean		
	public LocalDate date()
	{

		return LocalDate.of(2023, 01, 11);

	}

	@Bean
	public Boolean snacks()
	{
		System.out.println("generated name");
		return true;
	}
	@Bean
	public String hero()
	{
		System.out.println("generated name");
		return "rishab shetty";
	}
    @Bean 
    public String heroine()
    {
    	System.out.println("sampthami gowda");
    	return "desi";
    	
    }
    @Bean
    public double budget()
    {
    	System.out.println("generated budget");
    	return 1000.00;
    	
    }
    @Bean
    public int trp()
    {
    	System.out.println("generated trp");
    	return 22;
    	
    }
    
    
}