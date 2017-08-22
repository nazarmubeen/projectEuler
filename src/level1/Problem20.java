package level1;

import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args)
	{
		
		System.out.println();
		BigInteger number=factorial(new BigInteger("100"));
		System.out.println(number);
		int sumDigits=sumOfDigits(number);
		System.out.println("sumDigits"+sumDigits);
		
	}
	
	static int sumOfDigits(BigInteger n)
	{
		int sum=0;
		
		while(!n.equals(BigInteger.ZERO))
		{
			BigInteger d=n.mod(BigInteger.TEN);
			sum=sum+d.intValue();
			n=n.divide(BigInteger.TEN);
		}
			
		return sum;
	}
	
	
	
	
	static BigInteger factorial(BigInteger n)
	{
		if(n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO))
		{
			return BigInteger.ONE;
		}
		else{
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
}
