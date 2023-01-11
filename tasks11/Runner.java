package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.bin.BeanConfigure;
import com.xworkz.config.Hardwareshop;
import com.xworkz.config.Movies;
import com.xworkz.config.Pencil;
import com.xworkz.config.Rubber;
import com.xworkz.config.Software;
import com.xworkz.config.SoftwareEnginner;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new AnnotationConfigApplicationContext(BeanConfigure.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Hardwareshop hard=container.getBean(Hardwareshop.class);
		System.out.println(hard);
		
		SoftwareEnginner soft=container.getBean(SoftwareEnginner.class);
		System.out.println(soft);
		
		Software so=container.getBean(Software.class);
		System.out.println(so);
		
		Pencil p=container.getBean(Pencil.class);
		System.out.println(p);
		
		Rubber r=container.getBean(Rubber.class);
		System.out.println(r);
		
		Movies m=container.getBean(Movies.class);
		System.out.println(m);
		
		
		
		
		

	}

}
