class IndianRupeeTester{
       public static void main(String a[]){
	      IndianRupee i=new IndianRupee();
		  //i.IndianRupee();
		  i.serialNo="2675673";
		  i.color="GReen";
		  i.name="20";
		 
		  System.out.println(i.serialNo + " " + i.color + " " + i.name);
		  
		   System.out.println("***********");
		  IndianRupee i1=new IndianRupee();
		  i1.serialNo="1675673";
		  i1.color="Purple";
		  i1.name="100";
		  System.out.println(i1.serialNo + " " + i1.color + " " + i1.name);
	   }
}