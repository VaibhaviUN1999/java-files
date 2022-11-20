class Trimmer
{
	 public static void main(String args[])
	  {
	   String brand="hp";
	   double price=3000.50;
	   String color="black";
	   String warranty="2 year";
	   String trimmer[]={brand,color,warranty};
	   double vr[]={price};
	   String ref=trimmer[1];
	   double ref0=vr[0];
	   
	     System.out.println(ref);
		 System.out.println(ref0);
		  System.out.println("********");
		 for(int i=0;i<trimmer.length;i++)
		 {
		System.out.println(trimmer[i]);
		 } 
	  }
}