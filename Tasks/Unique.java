package com;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		String str="Akash";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		if(count>1)
		{
			System.out.println("not unique");
		}
		else
		{
			System.out.println("unique");
		}

	}

}
