class Marriage{
 public static void main(String args[]){
     String gender="Male";
	 String gender1="Female";
	 int age=30;
	 if(gender=="Male" && age>=21){
	    System.out.println("Get Married");
		if(age<21)
		{
		 System.out.println("Male child");
		}
		 else if(gender1=="Female" && age>=18){
		 System.out.println("Married");
		}
	  }
	  else{
	  System.out.println("No Marriage for females");
	  }
 }
 
 }