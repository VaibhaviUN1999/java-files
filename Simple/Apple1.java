import java.util.Scanner;
public class Apple1{
  
       void add(int a,int b){
	   System.out.println("sum of a" +a+ "and" +b+ "is" + (a+b));
	   }
   
   public static void main(String vaibhavi[]){
   Apple1 a=new Apple1();
   Scanner sc=new Scanner(System.in);
   System.out.println("enter 1st value");
   int a=sc.nextInt();
   System.out.println("enter 2nd value");
   int b=sc.nextInt();
   a.add(a,b);
   }
}