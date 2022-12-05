package com;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n[]= {};
		int count=0;
		//int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		
	}
}