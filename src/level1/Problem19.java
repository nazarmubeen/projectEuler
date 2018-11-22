package level1;

public class Problem19 {

	public static void main(String[] args)
	{
		int year;
		year=1900;
		int days;
		int count=0;
		while(year!=2000)
		{
			days=calculateDays(year);
			System.out.println(days);
			System.out.println(days%7);
			int day=days%7;
			int rem=7-day;
			System.out.println("rem "+rem);
			count=countSunday(rem,count);
			year++;
		}
		

		
		
		
		System.out.println(count);
	}
	
	static int calculateDays(int year)
	{
		int days;
		
		if((year%100!=0 && year%4==0) || year%400==0 )
		{
		days=30*4+31*7+29;
		}
		else{
			days=30*4+31*7+28;
		}
		
		return days;
	}
	
	static int countSunday(int rem,int c)
	{
		int i=31;
				while(i!=0)
				{
					if(i%7==rem)
					{
						c=c+1;
					}
				i--;
		}
				return c;
	}
	
}
