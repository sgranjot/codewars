package sumStringsAsNumbers;

public class Kata {

	public static String sumStrings(String a, String b) {
		
		StringBuilder sbResul = new StringBuilder();
		int diffLength = (Math.max(a.length(), b.length())) - (Math.min(a.length(), b.length()));
		StringBuilder sbA = new StringBuilder(a);
		StringBuilder sbB = new StringBuilder(b);
		int sum=0;
		int rest=0;
		
		
		//equalize the length of the strings 
		if(a.length() < b.length()) {
			for(int i=0; i<diffLength; i++) {
				sbA.insert(0, "0");
			}
		}
		if(b.length() < a.length()) {
			for(int i=0; i<diffLength; i++) {
				sbB.insert(0, "0");
			}
		}
		
		
		//sum
		for(int i=sbA.length()-1; i>=0; i--) {
			sum = Integer.valueOf(sbA.charAt(i)+"") + Integer.valueOf(sbB.charAt(i)+"") + rest;
			if(sum < 10) {
				sbResul.insert(0, String.valueOf(sum));
				rest=0;
			}if(sum >= 10 && i != 0) {
				sbResul.insert(0, String.valueOf(sum-10));
				rest=1;
			}else if(sum >= 10 && i == 0) {
				sbResul.insert(0, String.valueOf(sum));
			}
		}
		
		if(sbResul.charAt(0)=='0')
			sbResul.delete(0, 1);
		

		return sbResul.toString();
	}

}
