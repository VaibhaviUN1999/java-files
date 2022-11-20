class TeaStallTester{
    public static void main(String[] args){
	    TeaStall.setTeaStallId(5678);
		
		TeaStall.setcontactNo(9067561451L);
		TeaStall.setname("Mylarlingeshwara Cha Angadi");
		TeaStall.setaddress("Nagarbhavi");
		
		System.out.println("tea stall name is" + TeaStall.getTeaStallId());
		System.out.println("************");
		System.out.println("tea stall number is " + TeaStall.getcontactNo());
		System.out.println("************");
		System.out.println("Tea stall name is " + TeaStall.getname());
		System.out.println("************");
		System.out.println("Tea stall address is " + TeaStall.getaddress());
		System.out.println("************");
	 }
}