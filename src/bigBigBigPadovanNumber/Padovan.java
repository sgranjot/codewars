package bigBigBigPadovanNumber;

import java.math.BigInteger;

public class Padovan {

	private static BigInteger[] memo = new BigInteger[1000001];

	public static BigInteger Get(long power) {
		if (power < 3L) {
			return BigInteger.ONE;
		}
		if (memo[(int) power] != null) {
			return memo[(int) power];
		}
		BigInteger result = Get(power - 2L).add(Get(power - 3L));
		memo[(int) power] = result;
		
		return result;

	}
}
