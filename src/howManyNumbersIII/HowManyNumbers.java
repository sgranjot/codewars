package howManyNumbersIII;

import java.util.ArrayList;
import java.util.List;

public class HowManyNumbers {

	public static List<Long> findAll(final int sumDigits, final int numDigits) {
		
		ArrayList<Integer> numbers=new ArrayList();
		String numString="";
		int sum=0;
		
		for (int i = 0; i <= 9; i++) {
		    for (int j = 0; j <= 9; j++) {
		        for (int k = 0; k <= 9; k++) {
		            int num = i * 100 + j * 10 + k;
		            if(num<10) {
		            	numString="00"+num;
		            	for(String s : numString.split("")) {
		            		sum+=Integer.valueOf(s);
		            	}
		            	if(sum==sumDigits) {
		            		
		            	}
		            }
		            System.out.println(num);
		        }
		    }
		}
		
		
		return null;
	}
	
	

}
