package countingDuplicates;

public class CountingDuplicates {

	public static int duplicateCount(String text) {
		
		text=text.toLowerCase();

		int total = 0;

		while (text.length() > 0) {
			int num = text.length();
			text = text.replaceAll(text.charAt(0) + "", "");
			int num2 = text.length();
			if (num - num2 > 1) {
				total++;
			}
		}

		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
