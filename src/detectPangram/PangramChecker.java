package detectPangram;

public class PangramChecker {

	public boolean check(String sentence) {

		int cont = 0;

		char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (char c : abc) {
			if (sentence.toLowerCase().contains(c+"")) {
				cont++;
			}
		}

		return (cont == 26);

	}

}
