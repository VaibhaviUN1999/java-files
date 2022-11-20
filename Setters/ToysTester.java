class ToysTester{
    public static void main(String args[]){
	   Toys.setBrandName("Storio");
	   Toys.setMaterial("Fabric");
	   Toys.setColor("MultiColor");
	   Toys.setPrice(649);
	   System.out.println(Toys.getBrandName());
	   System.out.println("-----------------");
	   System.out.println(Toys.getMaterial());
	   System.out.println("-----------------");
	   System.out.println(Toys.getColor());
	   System.out.println("-----------------");
	   System.out.println(Toys.getPrice());
	   System.out.println("-----------------");
	}
}