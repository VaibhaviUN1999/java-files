package com.xworkz.tetra;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=3,urlPatterns="/choco")
public class ChocoalteServlet extends HttpServlet{
	
	public ChocoalteServlet()
	{
		System.out.println("chocolate started....");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("created" + this.getClass().getSimpleName());
	}

}
