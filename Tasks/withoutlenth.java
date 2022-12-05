package com;

public class withoutlenth {
	public static void main(String[] args) {
		String a="akash";
		int i=0,nstr=0;
		for(char b:a.toCharArray())
		{
			char c=a.charAt(i);
			i++;
			nstr=c+nstr;
		}
		System.out.println(nstr);
	}

}
