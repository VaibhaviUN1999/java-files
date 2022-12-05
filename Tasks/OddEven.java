package com;

public class OddEven
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int n[]= {2,3,4,5,6,7,8,9,1,12,13};
		System.out.println("Even numbers are");
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
			{
				System.out.println(n[i]);
			}
		}
			System.out.println("Odd numbers are");
			for(int j=0;j<n.length;j++)
			{
				if(n[j]%2!=0)
				{
					System.out.println(n[j]);
				}
			
			
		}
		

	}

}
