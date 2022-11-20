class Hai{
      void disp(){
	    System.out.println("hlo");
	  }
	  void disp1(String name, int age){
	   System.out.println("Name is" + name + "Age is" + age);
	  }
	  int disp2(int a,int b){
	  return a+b;
	  }
	  String disp3(){
	   return "bye";
	  }
	  

public static void main(String args[]){
	Hai i=new Hai();
	i.disp();
	i.disp1("suma",12);
	System.out.println(i.disp2(2,3));
	System.out.println(i.disp3());
	
}
}
	  