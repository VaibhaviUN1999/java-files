import java.util.Scanner;
class Reverse1 
{  
public static void main(String[] args)   
{  
Scanner s=new Scanner(System.in);
int  reverse = 0;  
System.out.println("enter a number");
int number = s.nextInt();

while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);
}  
}  