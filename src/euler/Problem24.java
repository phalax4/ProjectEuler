package euler;

import java.util.ArrayList;
import java.util.Collections;

public class Problem24 {
	public static int count = 0;

	public static void main(String[] args) {
		permutation("","0123456789");

	}
	public static void permutation(String prefix,String str){
		int n = str.length();
		if(n==0){
			count++;
			if(count ==1000000){
				System.out.println(prefix);
			}

		}else{
			for(int i = 0;i<n;i++)	{
				permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));

			}
		}
		
	}
}	
