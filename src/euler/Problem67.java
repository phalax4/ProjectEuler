package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem67 {
	// Dynamic Programming splitting a program in to smaller sub problems. Start
	// from bottom here
	public static void main(String[] args) throws FileNotFoundException {
		int[][] array = new int[100][100];
		int length;
		int outer = 0;
		boolean counter = true;
		int num1;
		int num2;
		int rNum = 1;
		Scanner reader = new Scanner(new File("num67.txt"));
		int Lmax;
		while (reader.hasNextLine()) {
			String str = reader.nextLine();
			String[] splitter = str.split(" ");
			for (int i = 0; i < splitter.length; i++) {
				array[outer][i] = Integer.parseInt(splitter[i]);
			}
			outer++;
		}
		for (int j = 99; j >= 1; j--) {
			for (int i = 0; i < array.length - rNum; i++) {
				num1 = array[j][i] + array[j - 1][i];
				num2 = array[j][i + 1] + array[j - 1][i];
				if (num1 > num2) {
					array[j - 1][i] = num1;
				} else {
					array[j - 1][i] = num2;
				}
			}
			rNum++;
		}
		System.out.println(array[0][0]);
	}

}
