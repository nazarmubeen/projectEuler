package level1;

public class Problem7 {

	public static void main(String[] args)
	{
		
		System.out.println(nthPrime(10001));
	
	}

	//algo
	
	static  boolean isPrime(int n)
	{
		
	if(n==1)
	{
	return false;
	}
	else if (n<4) {
		return true ;//2 and 3 are prime
	}
	else
	if (n % 2==0){
		return false;
	}
	else if (n<9) {
		return true; //we have already excluded 4,6 and 8.
	}
	else if (n % 3==0){
		return false;
	}
	else{
	
	int r= (int) Math.floor(Math.sqrt(n));// n rounded to the greatest integer r so that r*r<=n
	int f=5;
	while(f<=r)
	{
	if (n%f==0) {
		return false;// (and step out of the function)
	}
	if (n %(f+2)==0) {
		return false;// (and step out of the function)
	}
	f=f+6;
	}
	}
	return true;// (in all other cases)
	
	}

	static int nthPrime(int n)
	{
		int count=0;
		int i=2;
		int number=2;
		
		while(count!=n)
		{
			
			if(isPrime(i))
			{
				number=i;
				count++;
			}	
			i++;
		}
		
		return number;
	}
	
	///bruteforce
	static boolean primenumber(long n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
		    return false;
		}
		
		return true;
	}
	
	
}
