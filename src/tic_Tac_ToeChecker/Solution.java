package tic_Tac_ToeChecker;

public class Solution {
	
	public static int isSolved(int[][] board) {
		
		int draw = 0;
		String comb="";

		//recorrer verticales
		for(int[] arr : board){
			
			for(int i : arr) {
				if(i==0) draw = -1;
				comb +=i;
				if(comb.equals("111")) return 1;
				if(comb.equals("222")) return 2;
			}
			comb="";
		}
		
		
		comb="";
		
		
		//recorrer horizontales
		for(int i =0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				comb+=board[j][i];
				if(comb.equals("111")) return 1;
				if(comb.equals("222")) return 2;
			}
			comb="";
		}
		
		
		// comprobar diagonales
		switch ("" + board[0][0] + board[1][1] + board[2][2]) {
		case "111":
			return 1;
		case "222":
			return 2;
		}
		switch ("" + board[2][0] + board[1][1] + board[0][2]) {
		case "111":
			return 1;
		case "222":
			return 2;
		}

		return draw;
    }
	
	
	
	

}
