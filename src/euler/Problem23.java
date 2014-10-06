package euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Problem23 {
	// the problem was the way i was getting the abundant number sum.
	public static void main(String[] args) {
		int sum = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		final int LIMIT = 28123;
		boolean[] sumNum = new boolean[LIMIT + 1];// why plus 1? Because you
													// have to account for the
													// 0.

		for (int i = 1; i < 28123; i++) {
			int total = checkNumber(i);
			if (total > i) {
				array.add(i);
			}
		}

		Collections.sort(array);

		for (int i = 0; i < array.size(); i++) {
			for (int j = i; j < array.size(); j++) {
				if (array.get(i) + array.get(j) < 28123) {
					sumNum[array.get(i) + array.get(j)] = true;
				} else {
					break;
				}
			}
		}
		for (int i = 1; i < 28123; i++) {
			if (sumNum[i] == false) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static int checkNumber(int x) {
		int sum = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= Math.sqrt(x) + 1; i++) {//changing the <= to < and the +1 changes the sum dramatically. why?
			if (x % i == 0 && x != i) {
				if (!list.contains(i)) {
					list.add(i);
				}
				if (!list.contains(x / i)) {
					list.add(x / i);
				}
			}
		}
		Iterator<Integer> inter = list.iterator();
		while (inter.hasNext()) {
			sum += inter.next();
		}
		return sum;
	}

}
