class Son extends Father{
  @Override
   void Bike(){
      System.out.println("SB");
	  
   }
}
class Tester1{
public static void main(String args[]){
Son s=new Son();
s.Bike();

}
}