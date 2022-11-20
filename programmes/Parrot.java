import java.util.Scanner;
class Parrot{
		 public static void main(String args[]){
			      
					 Scanner sc=new Scanner(System.in);
			         System.out.println("enter numbers");
				     int a=sc.nextInt();
				     int b=sc.nextInt();
				     int sum=a+b;
					 System.out.println("enter the choice");
					 int choice=sc.nextInt();
				   
					
					 System.out.println("enter the numbers");
					 int d=sc.nextInt();
					 int e=sc.nextInt();
					 int sub=d-e;
					 
					 System.out.println("enter the numbers");
					 int f=sc.nextInt();
					 int g=sc.nextInt();
					 int mul=f*g;
					
			         
			 switch(choice){
			 case 1 : System.out.println("Addition of two numbers is" + sum);
				     break;
					 
		     case 2 : System.out.println("Subtration  of two numbers is" + sub);
				     break;
					 	 
		      case 3 : System.out.println("Multiplication  of two numbers is" + mul);
				     break;
					 	 				 
			        
			 } 
			 
		 }
		 
		 
	 }
	 
