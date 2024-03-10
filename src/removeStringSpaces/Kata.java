package removeStringSpaces;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {

    public static String noSpace(final String x) {

        return Pattern.compile(" ")
                .splitAsStream(x)
                .collect(Collectors.joining(""));

    }

}


/**
 * 
 * public static String noSpace(final String x) {
    return x.replaceAll(" ", "");
}
 */