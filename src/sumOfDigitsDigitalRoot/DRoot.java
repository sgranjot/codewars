package sumOfDigitsDigitalRoot;

public class DRoot {

	public static int digital_root(int n) {

		String nStr = String.valueOf(n);
		int result = 0;

		while (nStr.length() > 1) {
			result=0;
			for (char c : Integer.toString(n).toCharArray()) {
				result += Integer.valueOf(String.valueOf(c));
			}
			n = result;
			nStr = String.valueOf(n);
		}
		
		return result;
	}

}
