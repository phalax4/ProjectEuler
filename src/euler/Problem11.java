package euler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(new File("num11.txt"));
		int max = 0;
		int tNum;
		int c = 17;
		int[][] numArray = new int[20][20];

		for (int r = 0; r <= 19; r++) {
			String line = reader.nextLine();
			String[] list = line.split(" ");
			for (int n = 0; n <= 19; n++) {
				numArray[r][n] = Integer.parseInt(list[n]);
			}
		}
		// right left
		for (int j = 0; j <= 19; j++) {
			for (int i = 0; i <= 16; i++) {
				tNum = numArray[j][i] * numArray[j][i + 1] * numArray[j][i + 2]
						* numArray[j][i + 3];
				if (tNum > max) {
					max = tNum;
				}
				while (c <= 19) {
					tNum = numArray[j][c] * numArray[j][c - 1]
							* numArray[j][c - 2] * numArray[j][c - 3];
					c++;
				}
				if (tNum > max) {
					max = tNum;
				}
			}
		}
		// up down
		for (int j = 0; j <= 19; j++) {
			for (int i = 0; i <= 16; i++) {
				tNum = numArray[i][j] * numArray[i + 1][j] * numArray[i + 2][j]
						* numArray[i + 3][j];
				if (tNum > max) {
					max = tNum;
				}
				while (c <= 19) {
					tNum = numArray[c][j] * numArray[c - 1][j]
							* numArray[c - 2][j] * numArray[c - 3][j];
					c++;
				}
				if (tNum > max) {
					max = tNum;
				}
			}
		}
		// diagonal \\\\
		for (int j = 0; j <= 16; j++) {
			for (int i = 0; i <= 16; i++) {
				tNum = numArray[j][i] * numArray[j + 1][i + 1]
						* numArray[j + 2][i + 2] * numArray[j + 3][i + 3];
				if (tNum > max) {
					max = tNum;
				}
			}
		}
		// diagonal ////
		for (int j = 0; j <= 16; j++) {
			for (int i = 19; i >= 3; i--) {
				tNum = numArray[j][i] * numArray[j + 1][i - 1]
						* numArray[j + 2][i - 2] * numArray[j + 3][i - 3];
				if (tNum > max) {
					max = tNum;
				}
			}
		}
		reader.close();
		System.out.println(max);
	}
}
