package simplePigLatin;

import java.util.ArrayList;

public class PigLatin {

	public static String pigIt(String str) {

		String[] words = str.split(" ");

		ArrayList<StringBuilder> list = new ArrayList();

		String toReturn = "";
		

		for (String s : words) {
			if (!(s.charAt(0) + "").matches("[A-Za-z]")) {
				list.add(new StringBuilder(s + " "));
			} else if ((s.charAt(0) + "").matches("[A-Za-z]")) {
				list.add(new StringBuilder(s).append(s.charAt(0)).deleteCharAt(0).append("ay "));
			}
		}

		
		for (StringBuilder sb : list) {
			toReturn += sb.toString();
		}

		
		return toReturn.trim();

	}

}
