package braceChecker;

public class BraceChecker {

	public boolean isValid(String braces) {

		int openBrace = 0;
		int closeBrace = 0;
		int openBracket = 0;
		int closeBracket = 0;
		int openCourli = 0;
		int closeCourli = 0;

		for (int i = 0; i < braces.length() - 1; i++) {
			switch (braces.charAt(i)) {
			case '(':
				if (braces.charAt(i + 1) == ']' || braces.charAt(i + 1) == '}') {
					return false;
				}
				break;
			case '[':
				if (braces.charAt(i + 1) == ')' || braces.charAt(i + 1) == '}') {
					return false;
				}
				break;
			case '{':
				if (braces.charAt(i + 1) == ']' || braces.charAt(i + 1) == ')') {
					return false;
				}
				break;
			default:
				break;
			}
		}

		for (int i = 0; i < braces.length(); i++) {
			switch (braces.charAt(i)) {
			case '(':
				openBrace++;
				break;

			case ')':
				closeBrace++;
				if (closeBrace > openBrace) {
					return false;
				}
				break;
			case '[':
				openBracket++;
				break;

			case ']':
				closeBracket++;
				if (closeBracket > openBracket) {
					return false;
				}
				break;
			case '{':
				openCourli++;
				break;

			case '}':
				closeCourli++;
				if (closeCourli > openCourli) {
					return false;
				}
				break;
			default:
				break;
			}

		}

		if (openBrace != closeBrace || openBracket != closeBracket || openCourli != closeCourli) {
			return false;
		}

		return true;

	}
}
