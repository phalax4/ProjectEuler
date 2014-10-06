package euler;

import java.util.ArrayList;
import java.util.Collections;

public class Problem04 {

	public static void main(String args[]) {
		int current = 0;
		String str;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 100; i <= 999; i++) {
			for (int k = 100; k <= 999; k++) {
				current = i * k;
				str = Integer.toString(current);
				if (str.charAt(0) == str.charAt(str.length() - 1)) {
					if (str.charAt(1) == str.charAt(str.length() - 2)) {
						if (str.charAt(2) == str.charAt(str.length() - 3)) {
							list.add(Integer.parseInt(str));
							Collections.sort(list);
							// Store in an array? Efficiency? StringBuilder?
						}
					}
				}

			}

		}
		System.out.println(list);

	}
}
