package rangeExtraction;

public class Solution {

	public static String rangeExtraction(int[] arr) {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		boolean flag = true;

		for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i + 1] - arr[i] == 1) {
				if (flag) { //para imprimir el primer numero
					sb.append(","+arr[i]);
					flag = false;
				}
				count++;

			} else {
				if (count < 2) {
					sb.append("," + arr[i]);
				}
				if (count >= 2) {
					sb.append("-" + arr[i] );
				}
				flag = true;
				count = 0;
			}
		}
		if(flag) {
			sb.append(","+arr[arr.length-1]);
		}
		if(!flag && count>=2){
			sb.append("-"+arr[arr.length-1]);
		}
		if(!flag && count<2) {
			sb.append(","+arr[arr.length-1]);
		}
		if(sb.charAt(0)==',') sb.delete(0, 1);
		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(Solution
				.rangeExtraction(new int[] { -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20 }));
	}

	// "-6,-3-1,3-5,7-11,14,15,17-20"

}
