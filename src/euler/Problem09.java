package euler;

public class Problem09 {
	public static void main(String args[]) {
		int a, b, c;
		;
		int a2, b2, c2;
		for (int m = 1; m < 10000; m++) {
			a = calcA(m, m + 1);
			b = calcB(m, m + 1);
			c = calcC(m, m + 1);
			if (a + b + c > 1000) {
				continue;
			}

			if ((a + b + c) == 1000) {
				System.out.println("A: " + a + "B: " + b + " C: " + c);
				System.out.println(a * b * c);
				break;
			}

			for (int j = 1; j < 1000; j++) {
				if ((j * a) + (j * b) + (j * c) == 1000) {
					System.out.println(j * a + " " + j * b + " " + j * c
							+ " hi");
					System.out.println(((j * a) * (j * b) * (j * c)));
				}
			}
		}

		for (int m = 2; m < 10000; m += 2) {
			a2 = calcA2(m);
			b2 = calcB2(m);
			c2 = calcC2(m);
			if (a2 + b2 + c2 > 1000) {
				continue;
			}

			if ((a2 + b2 + c2) == 1000) {
				System.out.println("A: " + a2 + "B: " + b2 + " C: " + c2);
				System.out.println(a2 * b2 * c2);
				break;
			}

			for (int j = 1; j < 1000; j++) {
				if ((j * a2) + (j * b2) + (j * c2) == 1000) {
					System.out.println(j * a2 + " " + j * b2 + " " + j * c2
							+ " hi");
					System.out.println(((j * a2) * (j * b2) * (j * c2)));
				}
			}
		}
	}

	public static int calcA(int m, int n) {
		return (n * n) - (m * m);
	}

	public static int calcB(int m, int n) {
		return 2 * n * m;
	}

	public static int calcC(int m, int n) {
		return (n * n) + (m * m);
	}

	public static int calcA2(int m) {
		return 2 * m;
	}

	public static int calcB2(int m) {
		return (m * m) - 1;
	}

	public static int calcC2(int m) {
		return (m * m) + 1;
	}
}