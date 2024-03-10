package rgbToHexConversion;

public class RgbToHex {

	public static String rgb(int r, int g, int b) {
		return calcRest(r) + calcRest(g) + calcRest(b);
	}

	public static String calcRest(int num) {
		if (num > 255) num = 255;
		if (num < 0 ) num = 0;

		int rest1 = num % 16;
		num = num / 16;
		int rest2 = num % 16;

		return hex(rest2) + hex(rest1);
	}

	public static String hex(int num) {
		switch (num) {
		case 15:
			return "F";
		case 14:
			return "E";
		case 13:
			return "D";
		case 12:
			return "C";
		case 11:
			return "B";
		case 10:
			return "A";
		default:
			return String.valueOf(num);
		}
	}

	public static void main(String[] args) {

		System.out.println(rgb(1, 2, 3));

	}

}
