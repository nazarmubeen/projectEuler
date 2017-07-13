package level1;

public class Problem12 {
	public static void main(String[] args)
	{
	
		
		printTriangleNmubers();
		
	}
	
	static int printTriangleNmubers()
	{
		int number=0;
		int i=1;
		while(true)
		{
			
			number=number+i;
			System.out.println("number ="+number);
			int divisor=countNumberOfDivisor(number);
			System.out.println(" number having "+divisor+" divisor");
			if(divisor>500)
			{
				System.out.println("numer is ="+number);
				return number;
			}
			
			i++;
			
		}
		
	}
	
	static int  countNumberOfDivisor(int number)
	{
	//	System.out.println("count divisor for "+ number);
		if(number == 1)
		{
			return 1;
		}
		int sum=1;
		int prime=1;
		
		while(number!=1)
		{
		prime=getNextPrime(prime);
	//	System.out.println(" next prime ="+prime);
		int count=0;
		while(number%prime==0)
		{	
			
			number=number/prime;
			count++;
		}
		
		sum=(count+1)*sum;
		}
		
		return sum;
	}
	
	static int getNextPrime(int n)
	{
		if(n==1)
		{
			return 2;
		}
		n=n+1;
		while(isPrime(n)!=true)
		{
		//	System.out.println("is prime true");
			n++;
		}
		
		return n;
	}
	
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
}
