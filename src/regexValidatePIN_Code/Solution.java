package regexValidatePIN_Code;

public class Solution {

	public static boolean validatePin(String pin) {
		if(pin.matches("^\\d{4}$|^\\d{6}$")){
			return true;
		}
		return false;
	}

}
