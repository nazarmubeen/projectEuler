package level1;

public class Problem30 {

	public static void main(String[] args)
	{
		
		int digit=5;
		int maxLimit=(int)Math.pow(9, digit)*(digit-1);
		System.out.println("maxLimit "+maxLimit);
		int sum=totalSumOfNumbers(maxLimit);
		System.out.println(sum);

		
		
		
	}
	
	
	static int totalSumOfNumbers(int maxLimit)
	{
		int sum=0;
		int number=10;
		while(number!=maxLimit)
		{
			//System.out.println(" current number = "+number);
			if(number==sumOfPowers(number))
			{
				System.out.println("number "+number);
				sum=sum+number;
			}
			number++;
		}
		
		
		return sum;
		
	}
	
	static int sumOfPowers(int number)
	{
		
		int sum=0;
		while(number!=0)
		{
			int r=number%10;
			int powerRem=(int)Math.pow(r, 5);
			sum=sum+powerRem;
			number=number/10;
			
		}
		return sum;
	}
}
