class Student{
    private int age;
	private String name;
	private int marks;
	public void setage(int age){
	  if(age>25){
	    this.age=age;
	    System.out.println("Age has validation");
	  }
	  else{
	   System.out.println("Age not have any validations");
	  }
	
	}
	public int getage(){
	  return age;
	}
	public void setname(String name){
	  this.name=name;
	}
	public String getname(){
	  return name;
	}
	
	
    
}