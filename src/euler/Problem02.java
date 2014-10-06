package euler;

public class Problem02 {
	int firstTerm = 1;
	int secondTerm = 2;
	int thirdTerm = 0;
	int counter = 2;

	public static void main(String[] args) {
		Problem02 dave = new Problem02();
		dave.calculate();
	}

	public void calculate() {
		while (thirdTerm <= 4000000) {
			thirdTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
			if (thirdTerm % 2 == 0) {
				counter += thirdTerm;
			}
		}
		System.out.println(counter);
	}
}
