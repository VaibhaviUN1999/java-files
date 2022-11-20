class Toys{
  static String BrandName;
  static String Color;
  static String Material;
  static int Price; 
  static void setBrandName(String bn){
     BrandName=bn;
  } 
  static String getBrandName(){
     return BrandName;
  }
  static void setColor(String c){
	  Color=c;
  }
  static String getColor(){
	  return Color;
  }
  static void setMaterial(String m){
	 Material=m;
  }
  static String getMaterial(){
	  return Material;
  }
  static void setPrice(int p){
	  Price=p;
  }
  static int getPrice(){
	  return Price;
  }
}