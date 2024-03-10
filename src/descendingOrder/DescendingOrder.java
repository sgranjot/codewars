package descendingOrder;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        String [] arrayStrings = String.valueOf(Math.abs(num)).split("");

        Arrays.sort(arrayStrings, Collections.reverseOrder());

        String resultString = "";

        for (String string : arrayStrings) {
            resultString += string;
        }

        return Integer.parseInt(resultString);

    }

}
