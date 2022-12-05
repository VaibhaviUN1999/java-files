package com;

import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(a + " ");
			c=a+b;
			a=b;
			b=c;
		}
		

	}

}
