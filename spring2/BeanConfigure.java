package com.xworkz.boot;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("package com.xworkz.configure;")
public class BeanConfigure {

	@Bean
	public String name()
	{
		return "Times India";
	}

	@Bean
	public String owner()
	{
		return "Asha";
	}

	@Bean
	public double pricee()
	{
		return 50.0;
	}
	

		@Bean
		public String snakeName()
		{
			return "nagarahavu";
		}

		@Bean
		public String sType()
		{
			return "female";
		}

		@Bean
		public boolean ispoisinius()
		{
			return true;
		}

		@Bean
		public String enginName()
		{
			return "German";
		}

		@Bean
		public String eTtype()
		{
			return "medium";
		}

		@Bean
		public String Ecompany()
		{
			return "IBL";
		}

		@Bean
		public boolean isStroke()
		{
			return false;
		}

		@Bean
		public String gender()
		{
			return "female";
		}
		@Bean
		public int GostAge()
		{
			return 29;
		}

		@Bean
		public LocalDate dateOfBirth()
		{
			return LocalDate.of(1999, 05, 02);
		}
		@Bean
		public LocalDate dateOfDeath()
		{
			return LocalDate.of(2023, 04, 07);
		}


		@Bean
		public boolean isSiblings()
		{
			return true;
		}

		@Bean
		public boolean isAdharCard()
		{
			return true;
		}

	}
