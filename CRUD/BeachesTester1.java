class BeachesTester1{
   public static void main(String args[]){
	   Beaches.setbeachNames("Marina");
	   Beaches.setbeachNames("Malpe");	
	   Beaches.setbeachNames("Gokarna");	
	   Beaches.setbeachNames("Baga");
       Beaches.setbeachNames("gov");
       boolean value= Beaches.setbeachNames("Marina");
       Beaches.getBeachNames(value);
	   Beaches.updateBeachName("Paradise","Marina");
	   Beaches.updateBeachName("Morjim",2);
	  }
}