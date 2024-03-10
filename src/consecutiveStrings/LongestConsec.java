package consecutiveStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LongestConsec {

	public static String longestConsec(String[] strarr, int k) {

		if (strarr.length == 0 || k > strarr.length || k <= 0)
			return "";

		ArrayList<StringBuilder> list = new ArrayList();

		for (int i = 0; i < strarr.length - (k - 1); i++) {
			list.add(new StringBuilder(""));
			for (int j = 0, z = i; j < k; j++) {
				list.get(i).append(strarr[z]);
				z++;
			}
		}

		Collections.sort(list, new Comparator<StringBuilder>() {
			@Override
			public int compare(StringBuilder sb1, StringBuilder sb2) {
				return new Integer(sb2.length()).compareTo(new Integer(sb1.length()));
			}
		});

		return list.get(0).toString();

	}

}
