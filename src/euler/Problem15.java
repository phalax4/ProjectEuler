package euler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem15 {

	public static void main(String[] args) {
		float numRows = 20;
		float triRows = numRows * 2; // float triRows=(numRows*2)-2;
		System.out.println("Row: " + triRows);
		float mid = triRows / 2;
		BigInteger num = factorial(mid);
		BigInteger num3 = factorial(triRows);
		BigInteger top = new BigDecimal(num3).toBigInteger();
		BigInteger bottom = new BigDecimal(num).toBigInteger();
		BigInteger multi = bottom.pow(2);
		BigInteger divy = top.divide(multi);
		System.out.println("# of routes: " + divy);
	}

	public static BigInteger factorial(float x) {
		BigInteger sum = new BigInteger("1");
		for (int i = 1; i <= x; i++) {
			BigInteger num = new BigDecimal(i).toBigInteger();
			sum = sum.multiply(num);
		}
		return sum;
	}
}
