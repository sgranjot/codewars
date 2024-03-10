package tribonacciSequence;

public class Xbonacci {

	public double[] tribonacci(double[] s, int n) {

		switch (n) {
		case 0:
			return new double[0];
		case 1:
			double[] arr1 = { s[0] };
			return arr1;
		case 2:
			double[] arr2 = { s[0], s[1] };
			return arr2;
		case 3:
			double[] arr3 = { s[0], s[1], s[2] };
			return arr3;
		default:
			double[] arr = new double[n];
			arr[0] = s[0];
			arr[1] = s[1];
			arr[2] = s[2];

			for (int i = 3; i < n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
			}

			return arr;
		}

	}

}




/*LO MISMITO PERO BIEN
public double[] tribonacci(double[] s, int n) {
double[] r = new double[n];
for(int i = 0; i < n; i++){
  r[i] = (i<3)?s[i]:r[i-3]+r[i-2]+r[i-1];
}
return r;
}
*/