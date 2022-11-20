import java.util.Scanner;
class Character1{
   public static void main(String args[]){
     int count=0;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the string");
	 String name=sc.next();
	 for(int i=0;i<name.length();i++){
	   if(name.charAt(i)!=' '){
	      count++;
	   }
	 }
	   System.out.println(count);
	 
	   }
   }
   
   