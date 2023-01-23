package com.xworkz.tetra;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=2,urlPatterns="/mywish")
public class FastractServlet extends HttpServlet  {
	
	public FastractServlet()
	{
		System.out.println("created");
	} 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("created" + this.getClass().getSimpleName());
	}
	

}
