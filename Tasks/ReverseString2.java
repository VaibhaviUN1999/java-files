package com;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rev=" ";
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String name=sc.nextLine();
		//String rev="";
		for(char ch:name.toCharArray())
		{
			
			char c=name.charAt(i);
			i++;
			rev=c+rev;
		}
		System.out.println(rev);

	}

}
