class Vehicle{
     void start(){
	 System.out.println("Car Started");
	 }
}
class Scooty{
     void start(){
		 super.start();
	    System.out.println("Scooty Started");
		super.start();
	 }
}
class Tester2{
     public static void main(String args[]){
	     Scooty s=new Scooty();
		 s.start();
	 }
}