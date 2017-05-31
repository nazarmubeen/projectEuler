package level1;

public class Problem4 {

	public static void main(String[] args)
	{
		System.out.println(findMaxPallindrome(1000));
	}
	
	static int findMaxPallindrome(int a)
	{
		int max=0;
		
		
		
		
		for(int i=100;i<a;i++)
		{
			for(int j=i;j<a;j++)
			{
				int mul=i*j;
//				System.out.println("I ="+i +" j= "+j);
//				System.out.println("mul = "+mul);
				if(isPallindrome(mul) && mul>max)
				{
					max=mul;
				}
			}
		}
		
		
		
		
		return max;
	}
	
	static boolean isPallindrome(int n)
	{
	
		if(n!=reverseNumber(n))
		return false;
		
		return true;
	}
	
	
	static int reverseNumber(int n)
	{
		int sum=0;
		while(n>0)
		{
		int rem=n%10;
		sum=sum*10+rem;
		n=n/10;
		}
		
		return sum;
	}
}
