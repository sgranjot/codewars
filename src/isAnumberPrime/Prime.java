package isAnumberPrime;

public class Prime {

	public static boolean isPrime(int num) {

		if (num > 1) {

			if (num % 2 == 0 &&num!=2)
				return false;

			for (int i = 3; i*i <= num; i += 2) {
				if (num % i == 0)
					return false;
			}
			return true;
		}

		return false;
	}

	
	
	
	public static void main(String[] args) {

		
	}

}
