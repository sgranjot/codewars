package scramblies;

import java.util.HashMap;

public class Scramblies {

	public static boolean scramble(String str1, String str2) {
		/*
		StringBuilder sb = new StringBuilder(str1);
		List list;
	
		for(String s : str2.split("")) {
			list =Arrays.asList(sb.toString().split(""));
			if(list.contains(s)) {
				sb.deleteCharAt(sb.indexOf(s));
			}
		}
		
		if(sb.length()==str1.length()-str2.length()) {
			return true;
		}

		return false;
	}
*/
		
		
		HashMap<Character, Integer> map1 = new HashMap();
		HashMap<Character, Integer> map2 = new HashMap();
		
		for(Character c : str1.toCharArray()) {
			if(!map1.containsKey(c)) {
				map1.put(c, 1);
			}
			map1.put(c,	map1.get(c)+1);
		}
		
		
		for(Character c : str2.toCharArray()) {
			if(!map2.containsKey(c)) {
				map2.put(c, 1);
			}
			map2.put(c,	map2.get(c)+1);
		}
		
		
		for(Character c: map2.keySet()) {
			try {
				if(map2.get(c)>map1.get(c)) return false;
			}
			catch (NullPointerException ex) {
				return false;
			}
			
		}
		
		return true;
		

	}
	
}
