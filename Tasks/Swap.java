package com;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=10,b=20,c;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println(a + " " +b);

	}

}
