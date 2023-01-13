package com.xworkzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	
	@Autowired
	private Camera camera;
	
	public void camera()
	{
		System.out.println("created cameraman");
		System.out.println(camera.hashCode());
	}

}
