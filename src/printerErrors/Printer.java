package printerErrors;

import java.util.Arrays;

public class Printer {

    public static String printerError(String s) {

        int den = s.length();

        long num =
            Arrays.stream(s.split(""))
            .filter(c -> c.hashCode() > Character.valueOf('m'))
            .count();

        return num + "/" + den;

    }
    
}


/*
 * 
 * 
 * public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }



    public static String printerError(String s) {
        long errs = s.chars().filter( ch -> ch > 'm').count();
        return errs+"/"+s.length();
    }
 */