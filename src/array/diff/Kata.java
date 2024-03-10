package array.diff;

import java.util.ArrayList;

public class Kata {

	public static int[] arrayDiff(int[] a, int[] b) {

		ArrayList<Integer> list_a = new ArrayList();

		ArrayList<Integer> list_b = new ArrayList();
		for (int i : b) {
			list_b.add(i);
		}

		for (int i : a) {
			if (!list_b.contains(i)) {
				list_a.add(i);
			}
		}

		int[] arr = new int[list_a.size()];
		int j = 0;
		for (int i : list_a) {
			arr[j] = i;
			j++;
		}

		return arr;
	}


}
