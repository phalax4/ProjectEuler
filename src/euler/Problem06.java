package euler;

public class Problem06 {

	public static void main(String[] args) {
		int sumSq = 0;
		int sqSum = 0;
		for (int i = 1; i <= 100; i++) {
			sumSq += (i * i);
			sqSum += i;

		}
		sqSum *= sqSum;
		System.out.println("sumSq: " + sumSq);
		System.out.println("sqSum: " + sqSum);
		System.out.println(sqSum - sumSq);
	}

}
