package a;
//
//import java.util.Arrays;
//
//public class Largest3number {
//	public static void main(String[] args) {
//		int a[]= {1,2,9,7,5,3,7,9};
//		Arrays.sort(int[] a);
//		System.out.println(a);
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
//		//int i=0;
//		Arrays.sort(a);
//		System.out.println(a);
//		
//		System.out.println(a.length-3);
//	}
//
//}

import java.util.*;  
 class Largest3number {
	 public static void main(String[] args) {
		int a[]= {3,4 ,9,6,7,5,3};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println("third largest number :"+a[a.length-3]);
		
	}
}  