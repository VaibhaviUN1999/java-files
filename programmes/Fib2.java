import java.util.Scanner;
class Fib2{
	 public static void main(String args[]){
		 int a=1,b=1,c=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n=sc.nextInt();
		 while(c<=n){
			 c=a+b;
			 System.out.println(c + " ");
			 a=b;
			 b=c;
		 }
		 
		 
	 }
	
}