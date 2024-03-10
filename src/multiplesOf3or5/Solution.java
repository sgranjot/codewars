package multiplesOf3or5;

public class Solution {

	public int solution(int number) {
		
		if (number < 0) return 0;

		int sum = 0;

		for (int i = number-1; i > 0; i--) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}