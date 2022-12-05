package com;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String rev=sc.next();
		for(int i=rev.length()-1;i>=0;i--)
		{
			System.out.print(rev.charAt(i));
		}

		

	}

}
