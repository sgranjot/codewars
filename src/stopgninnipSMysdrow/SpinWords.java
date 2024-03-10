package stopgninnipSMysdrow;

public class SpinWords {

	public String spinWords(String sentence) {

		String[] arr = sentence.split(" ");
		StringBuilder sb = new StringBuilder();

		for (String str : arr) {
			if (str.length() >= 5) {
				StringBuilder sbReverse = new StringBuilder();
				sbReverse.append(str);
				sb.append(sbReverse.reverse() + " ");
			} else {
				sb.append(str + " ");
			}
		}
		return sb.toString().trim();
	}

}
