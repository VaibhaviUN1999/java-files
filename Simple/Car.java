class Car{
  
   int cost=33;
   public static void main(String args[])
  {
    Car c1=new Car();
	Car c2=new Car();
	System.out.println(c1.cost + " " + c2.cost);
	c1.cost=44;
	c2.cost=100;
	System.out.println(c1.cost + " " + c2.cost);
	
  }
}