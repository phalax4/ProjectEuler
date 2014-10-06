package euler;

import java.util.Scanner;

//30 min Brute Force to 232792560
public class Problem05 {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		String dec = reader.nextLine();
		if (Integer.parseInt(dec) == 1) {
			System.out.println(1 * 5 * 7 * 11 * 13 * 17 * 19 * 2 * 2 * 2 * 2
					* 3 * 3);
		} else {
			calculate();
		}

		reader.close();
	}

	public static void calculate() {
		int num = 2520;
		boolean looper = true;
		int counter = 0;
		while (looper == true) {
			for (int i = 1; i <= 20; i++) {
				if (num % i == 0) {
					counter++;
				}
			}

			if (counter == 20) {
				looper = false;
				System.out.println("Answer: " + num);
			} else {
				counter = 0;
				System.out.println(num);
				num++;
			}
		}
	}
}
