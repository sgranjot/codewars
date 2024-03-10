package vowelCount;

public class Vowels {

    public static int getCount(String str) {

        return (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> (c + "").matches("[aeiou]"))
                .count();

    }

}
