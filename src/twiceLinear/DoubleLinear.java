package twiceLinear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleLinear {
	
	public static int dblLinear(int n) {
		
		List<Integer> nums = new ArrayList();
		nums.add(1);
		int cont2 = 0;
		int cont3=0;
		
		for (int i = 1; i <= n; i++) {
            int x2 = 2 * nums.get(cont2) + 1;
            int x3 = 3 * nums.get(cont3) + 1;
            if (x2 <= x3) {
            	nums.add(x2);
            	cont2++;
                if (x2 == x3) {
                	cont3++;
                }
            } else {
            	nums.add(x3);
                cont3++;
            }
        }
        return nums.get(n);
    }
}
