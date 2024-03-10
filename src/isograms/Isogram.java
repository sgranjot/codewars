package isograms;

public class Isogram {

    public static boolean isIsogram(String str) {

        return str.chars()
                .mapToObj(x -> Integer.valueOf(Character.getNumericValue(x)))
                .sorted()
                .distinct()
                .count() == str.length();

    }

}
