package level1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args)
	{
		
		BigDecimal number=pow(new BigDecimal(2),1000);
		System.out.println(number);
		System.out.println(sumOfDigits(number));
	}
	
	static BigDecimal pow(BigDecimal n,int m){
		return power(n,m);
		
	}
	
	static BigDecimal power(BigDecimal a,int b)
	{
		BigDecimal num=a;
		
		while(b!=1)
		{
			num=num.multiply(a);
			b--;
		}
		return num;
		
	}
	
	static BigInteger  sumOfDigits(BigDecimal num1)
	{
		BigInteger num=num1.toBigInteger();
		System.out.println("bignumber"+num);
		BigInteger sum=new BigInteger("0");
		BigInteger zero=new BigInteger("0");
		BigInteger ten=new BigInteger("10");
		BigInteger rem=new BigInteger("0");
		while(!num.equals(zero))
		{
			rem=num.remainder(ten);
			System.out.println("rem = "+rem);
			sum=sum.add(rem);
			num=num.divide(ten);
			System.out.println("num = "+num);
					
		}
		
		return sum;
	}
}
