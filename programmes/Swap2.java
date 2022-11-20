class Swap2{
  public static void main(String args[]){
  int x=11,y=21;
  System.out.println("before swapping:" +x + " " +y);
  if(x<20){
     x=x-y;
	 y=x+y;
	 x=y-x;
	 System.out.println("After Swapping :" +x + " " +y);
  }
  }
}