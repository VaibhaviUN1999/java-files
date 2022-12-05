package com;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vowels=0,consonants=0;
		String str="Java is a High level object oriented programming language";
		System.out.println("vowels are: " );
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowels++;
				System.out.print(str.charAt(i));
			}
			else 
			{
				consonants++;
				
			}
		}
		System.out.println(vowels);
		System.out.println("consonants are: " );
		System.out.println(consonants);
		

	}

}
