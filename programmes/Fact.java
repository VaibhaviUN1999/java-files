import java.util.Scanner;
class Fact{
  public static void main(String args[]){
	
    Scanner sc=new Scanner(System.in);
	System.out.println("enter factorial of number");
	int fact=sc.nextInt();
	for(int i=1;i<5;i++){
	  fact=fact*i;
	}
	System.out.println("factorial number is " + fact);
  }

}