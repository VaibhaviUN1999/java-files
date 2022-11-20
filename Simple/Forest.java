class Forest
{
	 public static void main(String args[])
	  {
	   String name="xyz";
	   double totalArea=20.50;
	   String place="liansafari";
	   int tikate=140;
	   String animals[]={name,place};
	   double vr[]={totalArea,tikate};
	   String ref=animals[1];
	   double ref0=vr[0];
	   
	     System.out.println(ref);
		 System.out.println(ref0);
		  System.out.println("********");
		 for(int i=0;i<animals.length;i++)
		 {
		System.out.println(animals[i]);
		 } 
	  }
}