class SoapTester{
    public static void main(String args[]){
		//object creation of soap 
	   Soap s=new Soap();
	   Soap s1=new Soap();
	   s.shape="Oval";
	   s.name="Dove";
	   s.price=100;
	   s.display();
	   s.toGetFresh();
	   s1.shape="Rectangle";
	   s1.name="Dettol";
	   s1.price=30;
	   s1.display();
	   s1.toGetFresh();
	   //System.out.println("Soap ")
	}
}