class AirportTester{
   public static void main(String args[]){
     Airport1.setairportNames("Kempegowda");
	 Airport1.setairportNames("chennai");
	 Airport1.setairportNames("rajiv gandhi");
	 Airport1.setairportNames("calcutta");
	 Airport1.setairportNames("darjeeling");
	 boolean value=Airport1.setairportNames("calcutta");
	 Airport1.getairportNames(value);
	 Airport1.updateAirportName("delhi","pune");
   }
}