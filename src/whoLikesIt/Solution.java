package whoLikesIt;

public class Solution {

	
	public static String whoLikesIt(String... names) {
		
		StringBuilder sb = new StringBuilder();
		
		if (names.length==0) {
			return "no one likes this";
		}
		if(names.length>3) {
			return names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
		}
		
		for(int i = 0; i<names.length-1; i++) {
			sb.append(names[i] + ", ");
		}
		
		if(names.length==1) {
			return sb.append(names[0] + " likes this").toString();
		}
		return sb.replace(sb.length()-2, sb.length(), " and " +names[names.length-1] + " like this").toString();
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		System.out.println(whoLikesIt("Jorge", "Pepe"));
		
		
		
	}

}
