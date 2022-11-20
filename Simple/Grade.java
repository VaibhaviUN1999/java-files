class Grade{
 public static void main(String args[]){
   int marks=-1;
   System.out.println("enter your marks");
   if(marks>81 && marks<100)
   {
     System.out.println("Distinction");
   }
	else if( marks>35 && marks<80)
	{
	System.out.println("FCD");
	}
	else if(marks>0 && marks<34){
	System.out.println("Fail");
	}
	else{
	System.out.println("Invalid marks");
	}
	
 }
 }