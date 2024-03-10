package sortTheOdd;

import java.util.ArrayList;

public class Kata {

	public static int[] sortArray(int[] array) {

		ArrayList<Integer> impar = new ArrayList();
		int i =0;

		for (int j = 0; j < array.length; j++) {
			if (!(array[j] % 2 == 0)) {
				impar.add(array[j]);
			}

		}
		
		impar.sort((a, b) -> a.compareTo(b));

		for (int j = 0; j < array.length; j++) {
			if (!(array[j] % 2 == 0)) {
				array[j] = impar.get(i);
				i++;
			}
			
		}

		return array;
	}

}
