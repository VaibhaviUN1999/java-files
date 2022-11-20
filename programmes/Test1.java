import java.util.Scanner;
class Test1{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int recieved=a+b;
//System.out.println("marks recieved is"+recieved);
int total=recieved/200;
System.out.println(total);
double percentage=total*100;
System.out.println("percentage is"+percentage);
}
}