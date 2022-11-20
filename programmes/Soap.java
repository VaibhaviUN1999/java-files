class Soap{
//states
  String shape;
  String name;
  int price;
  
  //behaviours
  public static void toGetFresh(){
     System.out.println("***Rose***");
	 
}
void display(){
	System.out.println("Shape of the soap is " + this.shape);
	System.out.println("Name of the soap is " + this.name);
	System.out.println("Price for soap is " + this.price);
}
}