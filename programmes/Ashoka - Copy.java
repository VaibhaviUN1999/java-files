class Ashoka{
     public static void main(String args[]){
	  String type="Hotel"; 
	  String address=" Koramangala ";
	  System.out.println("list of managers are");
      String[] managerNames={"Harshitha","Monika","Prajwal","Prateek","Sowmya"};
      int noOfManagers=5;
      String foodMenu[]={"Puliyogare","Panner Manchuri","Mushroom manchuri","Pulav","MasalDose","Idli","Fried rice","Non","Puri","Chapathi","Fried rice","Panner Masala","Gobi manchuri","Kashmiri-pulav","SouthIndian-Meals"};
	  System.out.println("WELCOME TO ASHOKA");
	  System.out.println("Destination " + address);
	  for(int c=0;c<managerNames.length;c++){
		  System.out.println(managerNames[c]);
		  }
	  for(int d=0;d<foodMenu.length;d++){
		  // System.out.println("Menu list");
		  System.out.println(foodMenu[d]);
	  }
	  
	 }
}