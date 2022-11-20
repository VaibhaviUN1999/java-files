import java.util.Scanner;
class Sowmya{
    void add(int m,int n){
	  System.out.println("sum of m is" + m + "and" + n + "is" + (m+n));
	  
	}
	public static void main(String args[]){
	  Sowmya s=new Sowmya();
	  Scanner sc=new Scanner(System.in);
	  int m=sc.nextInt();
	  int n=sc.nextInt();
	   s.add(m,n);
	}
}