package euler;

public class Problem12_v2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		;

		boolean underDiv = true;
		int triNum;
		int count = 1;
		while (underDiv) {
			triNum = count * (count + 1) / 2;
			if (getFactors(triNum) > 500) {
				System.out.println(triNum);
				underDiv = false;
			}
			count++;
		}
		long end = System.currentTimeMillis();
		;
		System.out.println((end - start) + " ms");

	}

	private static int getFactors(int num) {
		int count = 0;
		for (int i = 1; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				count += 2;
			}
		}
		return count;
	}

}
// Totally did not know the formula n(n+1)/2 before this
