package sumOfIntervals;

import java.util.LinkedHashSet;
import java.util.Set;

public class Interval {
	public static int sumIntervals(int[][] intervals) {
		Set<Integer> notDuplicatedIntegers = new LinkedHashSet<>();
		for (int[] interval : intervals) {
			for (int i = interval[0]; i < interval[1]; i++) {
				notDuplicatedIntegers.add(i);
			}
		}
		return notDuplicatedIntegers.size();
	}
}
