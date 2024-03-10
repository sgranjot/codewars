package bitCounting;

public class BitCounting {

	public static int countBits(int n) {

		int bits = 0;

		for (char c : Integer.toBinaryString(n).toCharArray()) {
			if(c=='1') bits++;
		}
		return bits;

	}

}
