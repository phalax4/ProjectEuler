package euler;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem21 {

	public static void main(String[] args) {
		int total = 0;
		ArrayList<Integer> array = new ArrayList<Integer>(); HashSet set = new HashSet();
		for(int i = 1;i<10000;i++){
			if(i==getFactors(getFactors(i))){//the number equal to the factor of the amicable number
				System.out.println(i+"........"+getFactors(i));
				if(i!=getFactors(i)){//get rid of ones that are duplicates of another
					array.add(i);
					array.add(getFactors(i));
				}
			}
		}
		
		set.addAll(array);//getting rid of the duplicate pairs
		array.clear();
		array.addAll(set);
		for(int i = 0;i<array.size();i++){
			total+=array.get(i);
		}
		System.out.println(total);
	}
	public static int getFactors(int x){
		int sum = 1;
		for(int i = 2;i<Math.sqrt(x);i++){
			if(x%i==0){
				sum+=((x/i)+i);//getting both factors via symmetry
				
			}
		}
		return sum;
	}

}
