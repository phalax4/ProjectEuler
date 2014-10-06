package euler;

import java.util.HashMap;

public class Problem19 {

	public static void main(String[] args) {
		int[] month = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int dOfw = 0;
		int sunday = 0;
		map.put(9, 30);
		map.put(4, 30);
		map.put(6, 30);
		map.put(11, 30);
		map.put(2, 28);
		for (int i = 0; i < month.length; i++) {
			if (map.containsKey(month[i]) == false && i != 1) {
				map.put(month[i], 31);
			}
		}
		for (int year = 1900; year < 2001; year++) {
			for (int m = 1; m <= 12; m++) {

				if (m == 2 && year % 4 == 0 || m == 2 && 2000 % 400 == 0) {// leap
																			// year
					for (int d = 1; d <= 29; d++) {
						dOfw++;
						if (dOfw == 7 && d == 1) {
							if (year != 1900) {
								sunday++;
							}
							dOfw = 0;
						} else if (dOfw == 7 && d != 1) {
							dOfw = 0;
						} else {

						}
					}
				} else {
					for (int d = 1; d <= map.get(m); d++) {
						dOfw++;
						if (dOfw == 7 && d == 1) {
							if (year != 1900) {
								sunday++;
							}
							dOfw = 0;
						} else if (dOfw == 7 && d != 1) {
							dOfw = 0;
						} else {

						}
					}
				}
			}
		}
		System.out.println("Sundays on the first of the month: " + sunday);
	}
}
