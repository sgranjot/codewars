package delete_occurrences_of_an_element_if_it_occurs_more_than_n_times;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {

		ArrayList<Integer> lista = new ArrayList();

		for (int i : elements) {
			lista.add(i);
		}

		HashMap<Integer, Integer> map = new HashMap();
		
		//int j=0;
		
		
		
		Iterator<Integer> it = lista.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			
			if (!map.containsKey(i)) {
				map.put(i, 0);
			}
			map.put(i, map.get(i)+1);
			
			if (map.get(i) > Integer.valueOf(maxOccurrences)) {
				it.remove();
			}
			//else {
			//	j++;
			//}
		}
		
		/*
		//CON BUCLE FOR EACH TAMBIEN FUNCIONA PERO ITERATOR ES MAS LIMPIO A LA HORA DE BORRAR ELEMENTOS Y NO TENEMOS QUE CREAR LA VARIABLE J
		for (Integer i : lista) {
			if (!map.containsKey(i)) {
				map.put(i, 0);
			}
			map.put(i, map.get(i)+1);
			
			if (map.get(i) > Integer.valueOf(maxOccurrences)) {
				lista.remove(j);
			}
			else {
				j++;
			}
			
		}
		*/

		int[] finalElements= new int[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			finalElements[i] = lista.get(i);
		}

		
		
		return finalElements;
	}

	
	public static void main(String[] args) {
		
		EnoughIsEnough e = new EnoughIsEnough();
		int[] x= {6,6,7,7,8};
		for(int i : e.deleteNth(x, 2)) {
			System.out.println(i);
		}
		
	}
	

}


