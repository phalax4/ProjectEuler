package euler;

public class Problem07 {

	public static void main(String[] args) {
		System.out.println(getNthPrime(10000));
	}

	public static int getNthPrime(int n) {
		int k = 0;
		int p = 2;
		while (k < n) {
			p++;
			if (isprime(p))
				k++;
		}
		return p;
	}

	public static boolean isprime(int p) {
		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
}
