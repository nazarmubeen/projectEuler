package level1;

import java.util.ArrayList;
import java.util.List;

public class Problem32 {

	public static void main(String[] args)
	{
		System.out.println(getSum());
		
	}
	
	static long getSum()
	{
	List<Long> products = new ArrayList<>();
	long sum = 0;
	long prod, compiled;
	 
	for (long m = 2; m < 100; m++) {
	    long nbegin = (m > 9) ? 123 : 1234;
	    long nend = 10000 / m + 1;
	 
	    for (long n = nbegin; n < nend; n++) {
	        prod = m * n;
	        compiled = concat(concat(prod, n), m);
	        if (compiled >= 1E8 &&
	            compiled < 1E9 &&
	            isPandigital(compiled)) {
	            if (!products.contains(prod)) {
	                products.add(prod);
	            }
	        }
	    }
	}
	 
	for (int i = 0; i < products.size(); i++) {
	    sum += products.get(i);
	}
	
	
	return sum;
	}
	
	
	private static boolean isPandigital(long n) {
	    int digits = 0;
	    int count = 0;
	    int tmp;
	 
	    while (n > 0) {
	        tmp = digits;
	        int r=(int) ((n % 10) - 1);
	        int t=1 << r;
	        digits = digits + t ;
	        if (tmp == digits) {
	            return false;
	        }
	        count++;
	        n /= 10;
	    }
	    return digits == (1 << count) - 1;
	}
	
	private static long concat(long a, long b) {
	    long c = b;
	    while (c > 0) {
	        a *= 10;
	        c /= 10;
	    }
	    return a + b;
	}
}
