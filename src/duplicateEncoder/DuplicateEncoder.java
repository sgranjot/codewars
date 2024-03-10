package duplicateEncoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

	static String encode(String word) {
		
		String[] wordArr = word.toLowerCase().split("");

		Map<String, Integer> myMap = new HashMap<>();

		for (String  s : wordArr) {
			int actual = myMap.getOrDefault(s, 0);
			myMap.put(s, actual+1);
		}

		StringBuilder sb = new StringBuilder();

		for (String s : wordArr) {
			if (myMap.get(s) == 1) {
				sb.append("(");
			} else {
				sb.append(")");
			}
		}

		return sb.toString();
	}
	
}
