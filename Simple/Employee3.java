class Employee3{
    int id;
	String name;
	double salary;
	public static void main(String args[]){
	  class solution{
	  Employee1 e=new Employee1();
	  Employee2 e1=new Employee2();
	  Employee3 e2=new Employee3();
	  System.out.println(e.id + e.name + e.salary);
	  System.out.println(e1.id + e1.name + e1.salary);
	  System.out.println(e2.id + e2.name + e2.salary);
	  e.id=1;
	  e.name="raj";
	  e.salary=50.00;
	  e1.id=2;
	  e1.name="sham";
	  e1.salary=60.00;
	  e2.id=3;
	  e2.name="ram";
	  e2.salary=70.00;
	  System.out.println(e.id + e.name + e.salary);
	  System.out.println(e1.id + e1.name + e1.salary);
	  System.out.println(e2.id + e2.name + e2.salary);
	  }
	}
}