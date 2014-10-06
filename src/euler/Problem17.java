package euler;

import java.util.HashMap;

public class Problem17 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> tensMap = new HashMap<Integer, String>();
		HashMap<Integer, String> miscMap = new HashMap<Integer, String>();
		int sum = 0;
		String str;
		String[] array = { "one", "two", "three", "four", "five", "six",
				"seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		String[] array2 = { "twenty", "thirty", "forty", "fifty", "sixty",
				"seventy", "eighty", "ninety" };
		miscMap.put(0, "and");
		miscMap.put(2, "hundred");
		miscMap.put(3, "thousand");
		for (int i = 2; i <= 9; i++) {
			tensMap.put(i, array2[i - 2]);
		}
		for (int i = 1; i <= array.length; i++) {
			map.put(i, array[i - 1]);
		}
		for (int i = 1; i <= 1000; i++) {
			if (map.containsKey(i) && i <= 19) {
				sum += map.get(i).length();
			} else {
				str = String.valueOf(i);
				if (str.length() == 2) {
					if (i % 10 == 0) {
						sum += tensMap.get(i / 10).length();
					} else {
						sum += (tensMap.get(i / 10).length() + map.get(i % 10)
								.length());
					}
				} else if (str.length() == 3) {
					if (i % 100 / 10 == 0 && i % 10 == 0) {
						// 100,200
						sum += (miscMap.get(2).length() + map.get(i / 100)
								.length());
					} else if (i % 100 / 10 == 1) {
						// 117,214,519
						sum += (miscMap.get(2).length()
								+ miscMap.get(0).length()
								+ map.get(i % 100).length() + map.get(i / 100)
								.length());
					} else if (i % 100 / 10 == 0) {
						// 509,103,405
						sum += (miscMap.get(2).length()
								+ miscMap.get(0).length()
								+ map.get(i / 100).length() + map.get(i % 10)
								.length());
					} else if (i % 10 == 0) {
						// 270,340,180
						sum += (miscMap.get(2).length()
								+ miscMap.get(0).length()
								+ tensMap.get(i % 100 / 10).length() + map.get(
								i / 100).length());
					} else {
						// 993,237,425
						sum += (miscMap.get(2).length()
								+ miscMap.get(0).length()
								+ map.get(i / 100).length()
								+ tensMap.get(i % 100 / 10).length() + map.get(
								i % 10).length());
					}
				} else {
					// 1000
					sum += (map.get(1).length() + miscMap.get(3).length());
				}
			}
		}
		System.out.println(sum);
	}
}
