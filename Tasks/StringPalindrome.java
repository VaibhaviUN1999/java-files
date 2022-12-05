package com;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="gadagi",revstr="";
		int a=str.length();
		for(int i=a-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		if(str.equals(revstr.toLowerCase()))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}*/
		String revstr="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to be reversed");
		String rev=sc.next();
		int b=rev.length();
		for(int i=b-1;i>=0;i--)

		{
			revstr=revstr+rev.charAt(i);
		}
			if(rev.equals(revstr.toLowerCase()))
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		}
		

	}
