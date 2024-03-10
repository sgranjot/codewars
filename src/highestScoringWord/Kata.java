package highestScoringWord;

import java.util.TreeMap;

public class Kata {

	public static String high(String s) {
	    
		String abc=" abcdefghijklmnopqrstuvwxyz";
		
		String [] words = s.split("");
		
		String ordered="";
		
		TreeMap <Integer, String>tree = new TreeMap();
		
		
		for (int j=0; j<words.length; j++) {
			int total=0;
			for(int i = 0; i<words[j].length(); i++) {
				total+=abc.indexOf(words[j].charAt(i));
			}
			if(!tree.containsKey(total)) {
				tree.put(total,words[j]);
			}
			
		}
		
		ordered=tree.lastEntry().getValue();
		
		
	    return ordered;
	  }
	
	
	
}
