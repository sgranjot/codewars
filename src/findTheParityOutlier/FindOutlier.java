package findTheParityOutlier;

import java.util.ArrayList;

public class FindOutlier {

	static int find(int[] integers) {
		
		ArrayList<Integer> pares = new ArrayList();
		ArrayList<Integer> impares = new ArrayList();
		
		for(int i : integers) {
			if(i%2==0) {
				pares.add(i);
			}else {
				impares.add(i);
			}	
		}
		
		if(pares.size()>impares.size()) {
			return impares.get(0);
		}
		return pares.get(0);
				
	}

}
