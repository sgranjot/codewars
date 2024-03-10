package snail;

public class Snail {
	
	public static int[] snail(int[][] array) {
		
		if (array.length == 0 || array[0].length == 0) {
		    return new int[0];
		}
		
	    int n = array.length;
	    int[] result = new int[n * n];
	    
	    int index = 0;
	    int rowStart = 0;
	    int rowEnd = n - 1;
	    int colStart = 0;
	    int colEnd = n - 1;

	    while (rowStart <= rowEnd && colStart <= colEnd) {
	        //right
	        for (int i = colStart; i <= colEnd; i++) {
	            result[index++] = array[rowStart][i];
	        }
	        rowStart++;

	        //down
	        for (int i = rowStart; i <= rowEnd; i++) {
	            result[index++] = array[i][colEnd];
	        }
	        colEnd--;

	        //left
	        if (rowStart <= rowEnd) {
	            for (int i = colEnd; i >= colStart; i--) {
	                result[index++] = array[rowEnd][i];
	            }
	            rowEnd--;
	        }

	        //up
	        if (colStart <= colEnd) {
	            for (int i = rowEnd; i >= rowStart; i--) {
	                result[index++] = array[i][colStart];
	            }
	            colStart++;
	        }
	    }

	    return result;
	}
}
