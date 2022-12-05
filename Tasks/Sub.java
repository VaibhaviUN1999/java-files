package com;

import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+(~+b));

	}

}
