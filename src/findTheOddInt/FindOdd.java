package findTheOddInt;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {

	public static int findIt(int[] a) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i : a) {
			Integer actual = map.getOrDefault(i, 0);
			map.put(i, actual + 1);
		}

		for (int key : map.keySet()) {
			if (map.get(key) % 2 != 0) {
				return key;
			}
		}

		return 0;

	}

}
