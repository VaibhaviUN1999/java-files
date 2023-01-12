package com.xworkz.bean;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.boot.BeanConfigure;
import com.xworkz.configure.Engine;
import com.xworkz.configure.Ghost;
import com.xworkz.configure.NewsPaper;
import com.xworkz.configure.Snake;


public class Runner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(BeanConfigure.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println((container.getBeanDefinitionCount()));
		
		System.out.println("====== class Newspaper ======");
		NewsPaper ref = container.getBean(NewsPaper.class);
		System.out.println(ref);
		
		System.out.println("====== class Snake ======");
		Snake ref1 = container.getBean(Snake.class);
		System.out.println(ref1);
		
		System.out.println("====== class Engine ======");
		Engine ref2 = container.getBean(Engine.class);
		System.out.println(ref2);
		
		System.out.println("====== class Ghost ======");
		Ghost ref3 = container.getBean(Ghost.class);
		System.out.println(ref3);
		
	}
}
