package mexicanWave;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

		public static String[] wave(String str) {
		    List<String> result = new ArrayList<>();
		    for (int i = 0; i < str.length(); i++) {
		        char c = str.charAt(i);
		        if (Character.isLetter(c)) {
		            result.add(str.substring(0, i) + Character.toUpperCase(c) + str.substring(i + 1));
		        }
		    }
		    return result.toArray(new String[0]);
		}
}
