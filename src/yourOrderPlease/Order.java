package yourOrderPlease;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Order {

	public static String order(String words) {

		String[] wordsArray = words.split(" ");

		List<String> lista =  Arrays.asList(wordsArray);

		TreeMap<Integer, String> tree = new TreeMap();

		String ordered = "";
		
		

		for (String str : lista) {
			for (int i = 0; i < str.length(); i++) {
				if ((str.charAt(i) + "").matches("[0-9]")) {
					tree.put((int) str.charAt(i), str);
				}
			}
		}
		
		

		if (words.equals("")) {
			return "";
		}
		
		

		for (Integer i : tree.keySet()) {
			ordered += " " + tree.get(i);
		}

		
		
		return ordered.trim();
		
	}

	
	
	
	
	public static void main(String[] args) {

	}

}
