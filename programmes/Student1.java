import java.util.Scanner;
class Student1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int s=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		Student s=new Student();
		s.setage();
		int res=s.getage();
		System.out.println(res);
		s.setname();
		 String res1=s.getname();
		System.out.println();
		
	}
}