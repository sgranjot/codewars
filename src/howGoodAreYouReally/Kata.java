package howGoodAreYouReally;

import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < classPoints.length; i++) {
            integerList.add(classPoints[i]);
        }
        integerList.add(yourPoints);

        double average=
            integerList.stream()
            .mapToInt(i -> Integer.valueOf(i))
            .average().orElse(0);

        return yourPoints > average;
        
    }
    
}
