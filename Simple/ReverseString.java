import java.util.Scanner;
class ReverseString{
   public static void main(String args[]){
    String rev=" ";
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String name=sc.next();
	int len=name.length();
	for(int i=len-1;i>=0;i--){
	  rev=rev+name.charAt(i);
	}
	System.out.println(rev);
}
}