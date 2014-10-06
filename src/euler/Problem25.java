package euler;

import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		boolean counter = true;
		BigInteger t1 = new BigInteger("1");
		BigInteger t2 = new BigInteger("1");
		BigInteger t3;
		int count = 2;
		while (counter) {
			t3 = t1.add(t2);
			count++;
			if (t3.toString().length() == 1000) {
				System.out.println(count);
				System.out.println(t3);
				counter = false;
			}
			t1 = t2;
			t2 = t3;
		}
	}

}
