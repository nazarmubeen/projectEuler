package level1;

public class Problem1 {
	public static void main(String[] args)
	{
		
		System.out.println(getMultiples(1000));
	}
	
	public static int getMultiples(int n)
	{
		int i=1;
		int sum=0;
		while(i<n)
		{
	
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
				i++;
		}
		return sum;
		
	}
	
}
