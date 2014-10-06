package euler;

import java.util.ArrayList;

public class Problem03 {

	public static void main(String[] args) {
		Problem03 dave = new Problem03();

		// BigInteger y = new BigInteger("600851475143");

		System.out.println(dave.calculate(300425737571.5 * 2));
	}

	public ArrayList<Integer> calculate(double n) {

		ArrayList<Integer> factor = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				factor.add(i);
				n /= i;
			}
		}
		return factor;
	}
}