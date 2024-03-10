package doesMyNumberLookBigInThis;

public class NumberUtils {
	
	 public static boolean isNarcissistic(int number) {
	   
		 String num = String.valueOf(number);
		 
		 double narc=0;
		 
		 for (char c : num.toCharArray()) {
			 narc+=Math.pow(Double.valueOf(c+""),num.length());
		 }
		 
		 if(number == narc)
	        return true;
		 return false;
	 }


}
