class Beaches{
 static  String beachName[]={null,null,null,null,null,null,null};
 static int i;
 //save beach,store beachnames
 
 //public static boolean createBeach
 //public static boolean saveBeach
 public static boolean setbeachNames(String name){
	 //System.out.println("inside add BeachNames");
	 if(beachName.length<=7 && beachName != null){
	 beachName[i++]=name;
	 return true;
	 }
	 
	 else{
		 System.out.println("beach name exceeded");
		
	 }
	 return false;
	 
 }
 //READ Operation
  public static void getBeachNames(boolean value){
	  if(value==true){
     for(int i=0;i<beachName.length;i++){
	    String ref =beachName[i];
		System.out.println("Beach name is " + ref);
	 }
  } 
  else if(value==false){
	  System.out.println("No beaches available");
  }
  }
 

 //beachnames should not exceed 5 if it satisfiyes then only u can add.....
 //banks
//airports in india
//toursist place -->7
//stadiums
public static boolean updateBeachName(String newBeachName,String oldBeachName){
	
	if(newBeachName!=null && oldBeachName!=null){
		System.out.println("Update method Started");
		for(int i=0;i<beachName.length;i++){
			if(beachName[i] == oldBeachName){
				System.out.println("old beach names"+beachName[i]);
				beachName[i]=newBeachName;
				System.out.println("new beach names"+beachName[i]);
				return true;
			}
		}
	}
	return false;
}
  public static boolean updateBeachName(String newBeachName,int existingindex){
	  if(newBeachName!=null && newBeachName!=""){
	   for(int i=0;i<beachName.length;i++){
		   if(i == existingindex){
			   beachName[i]=newBeachName;
			   System.out.println("old beach names"+beachName[i]);
			   System.out.println("new beach names"+beachName[i]);
			   return true;
			   
		   }
		   
	   }
	  
  }
  return false;
}  
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
