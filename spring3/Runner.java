package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.config.ConfigBean;
import com.xworkz.config.ConfigureBeann;
import com.xworkzz.Battery;
import com.xworkzz.Camera;
import com.xworkzz.CameraMan;
import com.xworkzz.Director;
import com.xworkzz.Movie;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app=new AnnotationConfigApplicationContext(ConfigureBeann.class);
        System.out.println(Arrays.toString(app.getBeanDefinitionNames()));
        System.out.println("==================");
        Battery b=app.getBean(Battery.class);
        b.s();
        System.out.println("==================");
        Camera l=app.getBean(Camera.class);
        l.c();
        System.out.println("==================");
        CameraMan cm=app.getBean(CameraMan.class);
        cm.camera();
        System.out.println("==================");
        Director r=app.getBean(Director.class);
        r.mc();
        System.out.println("==================");
        Movie m=app.getBean(Movie.class);
        m.n();
	    System.out.println("==================");
        Company ll=app.getBean(Company.class);
        ll.a();
        System.out.println("==================");
        Producer l2=app.getBean(Producer.class);
        l2.p();
        
        
     
	}

}
