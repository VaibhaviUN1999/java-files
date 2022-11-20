import java.util.Scanner;
class Vowels{

   public static void main(String args[]){
      int vowels=0,consonants=0,spaces=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String str=sc.next();
	  for(int i=1;i<str.length();++i){
	     char ch=str.charAt(i);
	     if(ch=='a' || ch == 'e' || ch =='i' || ch == 'o' || ch =='u' ){
		     ++vowels;
		 }
		 else if(ch>='a' && ch<='z'){
		    ++consonants;
		 }
		 else if(ch==''){
		    ++spaces;
		 }
	  }
	  System.out.println("Vowels are " + vowels);
	  System.out.println("Consonants are " + consonants);
	  System.out.println("Spaces are" + spaces);
     
   }
}