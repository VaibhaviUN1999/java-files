public class Combination {
	
	public static int result(int n,int r) {
		int fact=1;
		return fact(n)/fact((n-r)*fact(r));

}
}
