package playingWithDigits;

public class DigPow {
	
	
	public static long digPow(int n, int p) {
		
		long result=0;

		for(int i=0; i<String.valueOf(n).length(); i++) {
			result+=Math.pow(Integer.parseInt(String.valueOf(n).charAt(i)+""), p);
			p++;
		}

		if(result%n==0) return result/n;
		
		return -1;
	}
	
	
	

}
