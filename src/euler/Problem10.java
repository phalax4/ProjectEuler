package euler;

public class Problem10 {
	// The problem was that the int data type could not support any bigger
	// number.
	// Had to change holding variable to long type to support the sum number.

	public static void main(String[] args) {
		long p = 2;
		long sum = 0;
		while (p <= 2000000) {
			if (isprime(p)) {
				sum += p;
			}
			p++;
		}
		System.out.println("Sum: " + sum);
	}

	public static boolean isprime(long p) {
		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
}
