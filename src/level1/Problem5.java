package level1;

public class Problem5 {

	public static void main(String[] args)
	{
		System.out.println(printLcm(20));
	}
	
	//better method
	static double printLcm(int n)
	{
		double lcm=1;
		int arr[]=new int[n+1];
		lcm(n, arr);
		print(arr);
		
		for(int i=0;i<n+1;i++)
		{
			double result=0;
			if(arr[i]!=0)
			result=Math.pow((i+1),arr[i]);
			System.out.println((i+1)+" result= "+result);
			if(result!=0)
			lcm=lcm*result;
		}
		
		return lcm;
		
	}
	
	
	static int[] lcm(int a,int[] arr)
	{
		int temp,counter=0;
		for(int i=2;i<a;i++)
		{
			temp=i;
			System.out.println(" i is "+i);
			counter=0;
			for(int j=2;j<=i;j++)
			{
				if(temp%j==0)
				{
					System.out.println(" temp is "+temp+" divisible by "+j);
					counter=0;
					while(temp%j==0)
					{
					temp=temp/j;
					counter++;
					System.out.println("for temp "+temp +" counter ="+ counter );
					if(counter>arr[j-1])
					arr[j-1]=arr[j-1]+1;
					}
				}
				
			}
			
		}
		
		
		return arr;
		
	}
	
	static void print(int [] arr)
	{
		System.out.println(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
	}
	
	
	
	
	//worst method
	
	static long smallestNumber(int a)
	{
		long max;
		int i=a;
		boolean status=true;
		while(true)
		{
		System.out.println("i= "+i);
		status=true;
		for(int j=2;j<=a;j++)
		{
			if(i%j==0)
			{
				continue;
			}
	
			else{
				status=false;
				break;
			}
			
		}
		
		if(status==true)
		{
			max=i;
			return max;
		}
		
		i=i+a;
			
		}
		
	}
}
