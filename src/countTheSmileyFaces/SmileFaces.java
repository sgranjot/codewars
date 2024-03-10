package countTheSmileyFaces;

import java.util.List;

public class SmileFaces {

	public static int countSmileys(List<String> arr) {

		int count=0;
		
		for(String str : arr) {
			if(str.matches("(^[:;][)D]$)|(^[:;][~-][)D]$)")) {
				count++;
			}
		}
		return count;
	}

}

