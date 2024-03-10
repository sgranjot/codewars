package validParentheses;

public class Kata {

	
	public static boolean validParentheses(String parenStr) {

		int open = 0;
		int close = 0;

		for (int i = 0; i < parenStr.length(); i++) {

			switch (parenStr.charAt(i)) {
			case '(':
				open++;
				break;

			case ')':
				close++;
				if (close > open) {
					return false;
				}
				break;
			default:
				break;
			}

		}

		if(open!=close) {
			return false;	
		}
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
