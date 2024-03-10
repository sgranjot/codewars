package romanNumeralsHelper;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

	public static String toRoman(int n) {
		int mil = 0;
		int cent = 0;
		int dec = 0;
		int uni = 0;

		StringBuilder sb = new StringBuilder();

		int calc = n;
		mil = Math.round(n / 1000);
		calc = n % 1000;
		cent = calc / 100;
		calc = calc % 100;
		dec = calc / 10;
		uni = calc % 10;

		// mil
		for (int i = 0; i < mil; i++) {
			sb.append("M");
		}

		// cent
		if (cent == 9) {
			sb.append("CM");
		}
		if (cent > 5 && cent < 9) {
			sb.append("D");
			for (int i = 0; i < cent - 5; i++) {
				sb.append("C");
			}
		}
		if (cent == 5) {
			sb.append("D");
		}
		if (cent == 4) {
			sb.append("CD");
		}
		if (cent >= 1 & cent < 4) {
			for (int i = 0; i < cent; i++) {
				sb.append("C");
			}
		}

		// dec
		if (dec == 9) {
			sb.append("XC");
		}
		if (dec > 5 && dec < 9) {
			sb.append("L");
			for (int i = 0; i < dec - 5; i++) {
				sb.append("X");
			}
		}
		if (dec == 5) {
			sb.append("L");
		}
		if (dec == 4) {
			sb.append("XL");
		}
		if (dec >= 1 & dec < 4) {
			for (int i = 0; i < dec; i++) {
				sb.append("X");
			}
		}

		// uni
		if (uni == 9) {
			sb.append("IX");
		}
		if (uni > 5 && uni < 9) {
			sb.append("V");
			for (int i = 0; i < uni - 5; i++) {
				sb.append("I");
			}
		}
		if (uni == 5) {
			sb.append("V");
		}
		if (uni == 4) {
			sb.append("IV");
		}
		if (uni >= 1 & uni < 4) {
			for (int i = 0; i < uni; i++) {
				sb.append("I");
			}
		}

		return sb.toString();

	}

	public static int fromRoman(String romanNumeral) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		int ant = 0;

		for (char c : romanNumeral.toCharArray()) {
			int actual = map.get(c);
			result += actual;
			if (actual > ant) {
				result -= 2 * ant;			//multiplicamos por dos para compensar la suma ya que al ser mayor se resta no se suma
			}
			ant = actual;
		}
		return result;

	}

}
