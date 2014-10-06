package euler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		double k = Math.pow(2, 1000);
		int total = 0;
		BigInteger num = new BigDecimal(k).toBigInteger();
		String str = num.toString();
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			int num1 = str.charAt(i) - 48;
			total += num1;
		}
		System.out.println(total);
	}
}
