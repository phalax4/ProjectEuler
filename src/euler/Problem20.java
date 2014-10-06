package euler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args) {
		int sum = 0;
		String str = factorial(100).toString();
		String[] array = str.split("(?!^)");
		for (int i = 0; i < array.length; i++) {
			sum += Integer.parseInt(array[i]);
		}
		System.out.println(sum);
	}

	public static BigInteger factorial(int x) {
		BigInteger multi = new BigInteger("1");
		for (int i = 1; i <= x; i++) {
			multi = multi.multiply(new BigDecimal(i).toBigInteger());
		}
		return multi;
	}
}
