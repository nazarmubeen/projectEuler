package level1;

public class Problem9 {

	public static void main(String[] args)
	{
	
		method1();
	}
	
	
	static void method1()
	{
		for (int a = 1; a < 1000; a++) {

			   for (int b = a + 1; b < 1000; b++) {

			    int c = 1000 - a - b;
	
			    if (a * a + b * b == c * c)  // Note: This implies b < c
			    {
			    	System.out.println("a = "+a+"b= "+b+"c = "+c);
			    	System.out.println("product = "+a*b*c);
			    }
			    
			   }

		
	}
	}
	
	
	static void method2()
	{
		for (int m = 1; m < 500; m++) {

			   for (int n = m+1; n < 500; n++) {
				   int a =(m*m)-(n*n);
				   int b=2*m*n;
				   int c=(m*m)-(n*n);
	
			    if (a +b+c==1000)  // Note: This implies b < c
			    {
			    	System.out.println("a = "+a+"b= "+b+"c = "+c);
			    	System.out.println("product = "+a*b*c);
			    }
			    
			   }

		
	}
	}
}

