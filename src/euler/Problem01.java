package euler;

public class Problem01 {

	public static void main(String[] args) {
		final int MAX = 1000;
		int sum = 0;

		for (int i = 0; i < MAX; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
