package com;

import java.util.Scanner;

public class Character2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String n=sc.next();
		for(char ch:n.toCharArray())
		{
			//System.out.println(count);
			count++;
		}
		System.out.println(count);

	}

}
