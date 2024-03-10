package directionsReduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DirReduction {

	public static String[] dirReduc(String[] arr) {

		int countA = 0;
		int countB = -1;
		List<String> directions = new LinkedList<>();
		directions.addAll(Arrays.asList(arr));

		while (countA != countB && directions.size() > 1) {
				countB = countA;
				for (int i = 0; i < directions.size() - 1; i++) {
					if (directions.size()>1 && directions.get(i).equalsIgnoreCase("north")
							&& directions.get(i + 1).equalsIgnoreCase("south")) {
						directions.remove(i);
						directions.remove(i);
						countB++;
					}
					else if (directions.size()>1 && directions.get(i).equalsIgnoreCase("south")
							&& directions.get(i + 1).equalsIgnoreCase("north")) {
						directions.remove(i);
						directions.remove(i);
						countB++;
					}
					else if (directions.size()>1 && directions.get(i).equalsIgnoreCase("west") && directions.get(i + 1).equalsIgnoreCase("east")) {
						directions.remove(i);
						directions.remove(i);
						countB++;
					}
					else if (directions.size()>1 && directions.get(i).equalsIgnoreCase("east") && directions.get(i + 1).equalsIgnoreCase("west")) {
						directions.remove(i);
						directions.remove(i);
						countB++;
					}
				}

		}

		return directions.toArray(new String[directions.size()]);
	}

	public static void main(String[] args) {
		ArrayList<String> lista =new ArrayList<String>();
		lista.addAll(Arrays.asList(dirReduc(new String[] {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","WEST","NORTH","SOUTH","SOUTH","EAST","WEST",
				"NORTH","NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","NORTH","EAST","EAST","WEST","NORTH","WEST","EAST","EAST","SOUTH","NORTH","WEST"})));
		
		lista.forEach(System.out::println);
	}

}
