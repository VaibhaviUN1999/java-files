class Truffles{
     public static void main(String args[]){
	  String type="Hotel"; 
	  String address=" Koramangala ";
      String[] managerNames={"Rithesh","Ronald","Chirag","Hrithik","Hazel"};
      int noOfManagers=5;
      String foodMenu[]={"Chocolate-Truffle","Black-Forest","Baked-Choco","Cafe-Latte","Very-Veggie","Tandoori-Paneer-Steak","Chicken-Paprika","All-American-Nachos","Tandoori-Chicken-Steak","Mexican-Chicken","Fries","Chilly-cheese-Toast","Sandwich","Chilly-Paneer","Spinach corn"};
	  System.out.println("WELCOME TO TRUFFLES");
	  System.out.println("Destination " + address);
	  for(int c=0;c<managerNames.length;c++){
		  //System.out.println("List of Managers");
		  System.out.println(managerNames[c]);
	  }
	  for(int d=0;d<foodMenu.length;d++){
		  //System.out.println("List of Food items");
		  System.out.println(foodMenu[d]);
	  }
	  
	 }
}