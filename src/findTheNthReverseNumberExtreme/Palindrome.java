package findTheNthReverseNumberExtreme;

import java.math.BigInteger;

public class Palindrome {
	
	public static BigInteger findReverseNumber(long n) {
        long count=0L;
        long num=0L;
        
        while(count<n) {
        	if(Palindrome.isReverse(num)) {
        		count++;
        	}
        	num++;
        }
        return BigInteger.valueOf(num-1);
    }
	
	
	public static boolean isReverse(long n) {
		if(n == 0) return true;
		int left =0;
		int rigth = String.valueOf(n).length()-1;
		while(left < rigth) {
			if(String.valueOf(n).charAt(left)!= String.valueOf(n).charAt(rigth)) return false;
			left++;
			rigth--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(findReverseNumber(100000000000L));
	}
}

