package euler;

import java.util.ArrayList;
import java.util.LinkedList;

public class Problem35 {

	public static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		int total = 1; int counter = 0;
		LinkedList<Integer> perm = sieve(1000000);
		for(int i = 0;i<perm.size();i++){
			
		}
		System.out.println(total);
	}
	public static boolean isPrime(int x){
		if(x%2==0){
			return false;
		}
		for(int i = 3;i*i<=x;i+=2){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void permutation(String prefix,String str){
		int n = str.length();
		if(n==0){
			list.add(prefix);
		}else{
			for(int i = 0;i<n;i++)	{
				permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));

			}
		}
		
	}
	 public static LinkedList<Integer> sieve(int n){
         if(n < 2) return new LinkedList<Integer>();
         LinkedList<Integer> primes = new LinkedList<Integer>();
         LinkedList<Integer> nums = new LinkedList<Integer>();

         for(int i = 2;i <= n;i++){ //unoptimized
                 nums.add(i);
         }

         while(nums.size() > 0){
                 int nextPrime = nums.remove();
                 for(int i = nextPrime * nextPrime;i <= n;i += nextPrime){
                         nums.removeFirstOccurrence(i);
                 }
                 primes.add(nextPrime);
         }
         return primes;
 }

}
