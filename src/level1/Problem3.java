package level1;

public class Problem3 {

	public static void main(String[] args)
	{
		long l=600851475143L;
		System.out.println(" max prime factor ="+primeFactor(l));
	}
	
	static long primeFactor(long n)
	{
		long max=2;
		for(long i=2;i<n/2-1;i++)
		{
			if(n%i==0){
				n=n/i;
				if(primenumbers(n))
				max=n;	
			}
		}
		return max;
		
	}
	
	
	static boolean primenumbers(long n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
		    return false;
		}
		
		return true;
	}
	
	
}
