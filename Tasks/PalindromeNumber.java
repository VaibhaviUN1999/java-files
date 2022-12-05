package com;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int rev=0; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=n;
		while(temp!=0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
