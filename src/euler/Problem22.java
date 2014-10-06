package euler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new FileReader("num22.txt")); ArrayList<String> alist = new ArrayList<String>();int sum = 0;
		HashMap <String, Integer> map = new HashMap<String,Integer>();int numSum=0;
		for(int i = 1;i<=26;i++){
			map.put(Character.toString(((char)(i+64))), i);
		}
		String str = reader.next();
		String str2 = str.replace("\"","");
		String[] list = str2.split(",");
		for(int i = 0;i<list.length;i++){
			alist.add(list[i]);
		}
		Collections.sort(alist);
		for(int i = 0;i<alist.size();i++){
			String[] word = alist.get(i).split("");
			for(int l = 1;l<word.length;l++){
				numSum+= map.get(word[l]);
			}
			sum+=(numSum*(i+1));
			numSum=0;

		}
		System.out.println(sum);
	}
}
//plancks constant? pvnrt constant store