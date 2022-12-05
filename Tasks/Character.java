package com;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
