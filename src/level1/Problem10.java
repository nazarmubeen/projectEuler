package level1;

public class Problem10 {

	public static void main(String[] args){
		
		
		System.out.println(sumOfPrime(2000000));
		
		
		
	}
	
	
	
	static long sumOfPrime(int n)
	{
		int i=2;
		long sum=0;
		while(i<=n)
		{
			if(isPrime(i))
			{
				sum=sum+i;
			}
			i++;
		}
		
		return sum;
		
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
	
}
