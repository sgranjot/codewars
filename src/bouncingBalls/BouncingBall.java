package bouncingBalls;

public class BouncingBall {

	public static int bouncingBall(double h, double bounce, double window) {

		if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
			return -1;
		}
		double newH = h * bounce;
		int count = 1;
		while (newH > window) {
			count += 2;
			newH = newH * bounce;
		}
		return count;
	}
}