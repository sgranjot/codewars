package triangleArea;

public class Kata {
	
	public static float tArea(String tStr) {
	
	    return (float) (Math.pow((tStr.length() - tStr.replace("\n", "").length() - 2), 2)) / 2;
	  }
	
	public static void main(String[] args) {
		System.out.println(Kata.tArea(""));
	}
	
}
