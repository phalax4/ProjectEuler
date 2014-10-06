package euler;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(new File("num13.txt"));
		BigInteger[] array = new BigInteger[100];
		BigInteger sum = new BigInteger("0");
		int counter = 0;
		String str = "";
		while (reader.hasNext()) {
			array[counter] = new BigInteger(reader.next());
			counter++;
		}
		for (int i = 0; i < array.length; i++) {
			sum = sum.add(array[i]);
		}
		for (int i = 0; i < 10; i++) {
			str += sum.toString().charAt(i) - 48;
		}
		System.out.println("First ten digits: " + str);
		System.out.println("Entire Number: " + sum);
		reader.close();
	}
}
