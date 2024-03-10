package weightForWeight;

import java.util.Comparator;
import java.util.PriorityQueue;

public class WeightSort {

	public static String orderWeight(String strng) {

		String[] splitedStrings = strng.split("[\\s\\t]+");
		String result = "";

		PriorityQueue<String> sortList = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
                int value = Integer.compare(sumDigits(o1), sumDigits(o2));
                if (value == 0) {
                    return o1.compareTo(o2); 
                }
                return value;
            }
        });

		for (String s : splitedStrings) {
			sortList.add(s);
		}

		for (String s : sortList) {
			result += s + " ";
		}

		return result.trim();

	}

	public static Integer sumDigits(String s) {
		int result = 0;
		for (String str : s.split("")) {
			result += Integer.valueOf(str);
		}
		return result;
	}

}
