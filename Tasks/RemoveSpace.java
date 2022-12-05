package com;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		String s=sc.next();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ') {
		      System.out.print(c[i]);
			}
		}

	}

}
