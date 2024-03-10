package meanSquareError;

import java.util.ArrayList;

public class Solution {
	
	
	public static double solution(int[] arr1, int[] arr2) {
		
		ArrayList <Double> list= new ArrayList();
		double sum=0;
		
		for(int i=0; i< arr1.length; i++) {
			list.add(Math.pow(arr1[i]-arr2[i], 2));
		}
		
		for(double d : list) {
			sum+=d;
		}
		
		
	    return sum/list.size();
	  }
	
	

}
