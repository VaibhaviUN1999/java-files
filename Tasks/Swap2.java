package com;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=10,b=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+ " " +b);

	}

}
