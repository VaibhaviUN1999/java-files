import java.util.Scanner;
class Mukta{
   public static void main(String args[]){
	   int t;
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the numbers");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   t=a;
	   a=b;
	   b=t;
	   System.out.println("a:" + a);
	   System.out.println ("b:" + b);
	   
   }
}