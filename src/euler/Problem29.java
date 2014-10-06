package euler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem29 {

	public static void main(String[] args) {
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		for(int i = 2;i<=100;i++){
			BigInteger num1 = new BigDecimal(i).toBigInteger();
			for(int j = 2;j<=100;j++){
				if(!list.contains(num1.pow(j))){
					list.add(num1.pow(j));
				}
			}
		}
		System.out.println(list.size());
	}
}
