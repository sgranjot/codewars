package regexpBasics_IsItA_EightBitUnsignedNumber;

public class Kata {

	public static boolean eightBitNumber(String n) {
		if (n.matches("(^[0-9]$)|(^[1-9][0-9]$)|(^[1][0-9][0-9]$)|(^[2][0-4][0-9]$)|(^[2][5][0-5]$)")) {
			return true;
		}
		return false;
	}

}
