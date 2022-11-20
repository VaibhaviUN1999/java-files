class Zomato
{
   
   public static double takeOrder(String item , int qunt )
   {
	  
	  if(item == "pizza")
	  {
	    System.out.println("Thank you for ordering " + item);
		return 100;
	  }
	  if(item == "Burger")
	  {
	     System.out.println("Thank you for ordering " + item);
		 return 60;
	  }
	   if(item == "SouthIndianThali")
	  {
	     System.out.println("Thank you for ordering " + item);
		 return 250;
	  }
	   if(item == "Mosaranna")
	  {
	     System.out.println("Thank you for ordering " + item);
		 return 25.07 * qunt;
	  }
	   if(item == "pastries")
	  {
	     System.out.println("Thank you for ordering " +  item);
		 return 60;
	  }
	  
	  return 0.0 ;
   }
}