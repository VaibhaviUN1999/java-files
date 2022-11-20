class FurnitureTester{
 public static void main(String args[]){
    Furniture.setname("Cloudify");
	Furniture.setprice(1699);
	Furniture.setcolor("Brown");
	System.out.println("Furniture name is" + Furniture.getname());
	System.out.println("*****************");
	System.out.println("Furniture price is" + Furniture.getprice());
	System.out.println("*****************");
	System.out.println("Furniture name is" + Furniture.getcolor());
	System.out.println("*****************");
	
 }
}