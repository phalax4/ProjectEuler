package euler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem14 {

	public static void main(String[] args) {
		BigInteger num;
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger zero = new BigInteger("0");
		boolean isOne = false;
		int count;
		float MAX = 0;
		for (float i = 1000000; i > 1; i--) {
			num = new BigDecimal(i).toBigInteger();
			count = 0;
			isOne = false;
			while (isOne == false) {
				if (num.equals(one)) {
					isOne = true;
				}
				if (num.mod(two).equals(zero)) {
					count++;
					num = even(num);
				} else {
					count++;
					num = odd(num);
				}
			}
			if (count > MAX) {
				System.out.println("Starting Number: " + i);
				System.out.println("Chain #: " + count);
				MAX = count;
			}
		}
	}

	public static BigInteger odd(BigInteger x) {
		BigInteger one = new BigInteger("1");
		BigInteger three = new BigInteger("3");
		return (three.multiply(x)).add(one);
	}

	public static BigInteger even(BigInteger x) {
		BigInteger two = new BigInteger("2");
		return x.divide(two);
	}

}
