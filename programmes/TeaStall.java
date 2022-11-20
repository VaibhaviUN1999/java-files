class TeaStall{
   static int teaStallId;
   static String name;
   static String address;
   static long contactNo;
   
   //setter ND GETTER
   
   static void setTeaStallId(int id){
	   teaStallId=id;
   }
   static int getTeaStallId(){
	   
	   return teaStallId;
   }
	   
	   
   static void setcontactNo(long cNo){
	    contactNo=cNo;
		
   }
   static long getcontactNo(){
	   return contactNo;
	   
   }
   static void setname(String nm){
	   name=nm;
   }
   static String getname(){
	   return name;
	   
   }
   static void setaddress(String add){
	   address=add;
   }
   static String getaddress(){
	   return address;
   }
}