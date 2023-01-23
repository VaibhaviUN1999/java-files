package com.xworkz.tetra;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=5,urlPatterns="/bestie")
public class FriendServlet extends HttpServlet {
   public FriendServlet()
   {
	   System.out.println("calling your bestiee");
   }
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	
	

}
