import java.util.Scanner;
class Consonants{
    public static void main(String args[]){
	  int vowels=0,consonants=0,space=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the string");
	  String str=sc.next();
	  
	  for(int i=1;i<str.length();++i)
	  {
		  char ch=str.charAt(i);
	     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		   ++vowels;
		 }
		 else if(ch>='a' && ch<='z'){
		  ++consonants;
		 }
		 else if(ch==' '){
		  ++space;
		 }
	  
	  }
	  System.out.println("Vowels:" + vowels);
	  System.out.println("Consonants:" +consonants);
	  System.out.println("Space:"+ space);
	}
}