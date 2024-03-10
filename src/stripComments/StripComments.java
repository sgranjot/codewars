package stripComments;


import java.util.LinkedList;
import java.util.List;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {

        String[] arrLineStrings = text.split("\n");

        StringBuilder sbFinal = new StringBuilder();

        List<StringBuilder> listLines = new LinkedList<>();

        for (String str : arrLineStrings) {
            int lastCharIndex = str.length() - 1;
            if (lastCharIndex >= 0 && str.charAt(lastCharIndex) == ' ') {
                listLines.add(new StringBuilder(str.substring(0, lastCharIndex)));
            } else {
                listLines.add(new StringBuilder(str));
            }
        }

        for (StringBuilder stb : listLines) {
            for (String str : commentSymbols) {
                int commentIndex;
                while ((commentIndex = stb.indexOf(str)) >= 0) {
                    stb.delete(commentIndex, stb.length());
                    if (commentIndex > 0 && stb.charAt(commentIndex - 1) == ' ') {
                        stb.delete(commentIndex - 1, commentIndex);
                    }
                }
            }
        }

        for (StringBuilder s : listLines) {
            sbFinal.append(s).append("\n");
        }

        return sbFinal.deleteCharAt(sbFinal.length() - 1).toString();
    }
}
