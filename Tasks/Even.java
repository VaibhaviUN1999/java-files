package com;

import java.util.Scanner;

public class Even {
	 
	public static void main(String[] args) {
		
	
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number");
	 int n=sc.nextInt();
	 if(n%2==0)
	 {
		 System.out.println("even");
	 }
	 else
	 {
		 System.out.println("odd");
	 }
		// TODO Auto-generated method stub

	}
}
	
//	static String a="akash";
//	static int i=0;
//	static String nstr="";
//	
//	static void rev()
//	{
//		char c=a.charAt(i);
//		i++;
//		nstr=c+nstr;
//		
//	}

		/*public static void main(String[] args) {
			String a="akash";
			int i=0;
			
			String nstr="";
			for(char b:a.toCharArray())
			{
				char c=a.charAt(i);
				i++;
				nstr=c+nstr;
				//System.out.println(nstr);
			}
			System.out.println(nstr);
			//rev();
		}

	}*/


