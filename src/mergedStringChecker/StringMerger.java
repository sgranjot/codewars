package mergedStringChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMerger {

	public static boolean isMerge(String s, String part1, String part2) {

		List<String> list1 = Arrays.asList(part1.split(""));
		List<String> list2 = Arrays.asList(part2.split(""));
		List<Integer> l1 = new ArrayList();
		List<Integer> l2 = new ArrayList();
		boolean flag = true;

		System.out.println(s);
		System.out.println(part1);
		System.out.println(part2);

		for (String str : s.split("")) {
			if (list1.contains(str)) {
				l1.add(list1.indexOf(str));
			} else if (list2.contains(str)) {
				l2.add(list2.indexOf(str));
			}
		}

		for (int i = 0; i < l1.size() - 1; i++) {
			if (Integer.compare(l1.get(i), l1.get(i + 1)) > -1) {
				flag = false;
			}
		}

		for (int i = 0; i < l2.size() - 1; i++) {
			if (Integer.compare(l2.get(i), l2.get(i + 1)) > -1) {
				flag = false;
			}
		}

		if (s.length() != l1.size() + l2.size()) {
			flag = false;
		}

		if (s.equals("")) {
			if (part1.equals("") && part2.equals("")) {
				flag = true;
			}else {
				flag = false;
			}

		}

		return flag;
	}

}
