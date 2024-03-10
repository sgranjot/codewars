package regexpBasics_parsingPrices;

public class CentParser {

	public static Integer toCents(String price) {
		if(!price.matches("(^\\$[1-9][0-9]+\\.\\d{1,2}$)|(^\\$0{1}\\.\\d{1,2}$)|(^\\$[1-9]\\.\\d{1,2}$)")) return null;
		String reString ="";
		
		for(char c : price.toCharArray()) {
			if(String.valueOf(c).matches("\\d")) {
				reString+=c;
			}
		}
		return Integer.valueOf(reString);
	}

}
