package level1;

public class Problem6 {

	public static void main(String[] args)
	{
		
		
		int sumofsquares=sumOfSquares(100);
		System.out.println(sumofsquares);
		int sumsquares=sumSquares(100);
		System.out.println(sumsquares);
		
		System.out.println("difference = "+(sumsquares-sumofsquares));
	}
	
	
	static int sumOfSquares(int n)
	{
		return ((n)*(n+1)*(2*n+1))/6;
	}
	
	static int sumSquares(int n)
	{
		int x=(n*(n+1))/2;
		return x*x;
	}
}
