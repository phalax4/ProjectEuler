import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {

		public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        int count = 0;
	        for (int i=1; i<28123; i++) {
	            int sum = sumOfDiv(i);
	            if (sum > i) {
	                list.add(i);
	                count++;
	            }
	        }
	        Map<Integer, String> map = new HashMap<>();
	        for (int one : list) {
	            for (int two : list) {
	                int sum = one + two;
	                if (sum > 28123) {
	                    break;
	                } else {
	                    if (!map.containsKey(sum)) {
	                        map.put(sum, null);
	                    }
	                }
	            }
	        }
	        int total = 0;
	        for (int i=1; i<=28123; i++) {
	            if (!map.containsKey(i)) {
	                total += i;
	            }
	        }
	        System.out.println(total);
	    }
	     
	    public static int sumOfDiv(int pValue) {
	        List<Integer> listValue = new ArrayList<>();
	        int totalValue = 1;
	        for (int i=2; i<=Math.sqrt(pValue) + 1; i++) {
	            if (pValue%i == 0 && pValue != i) {
	                if (!listValue.contains(i)) {
	                    listValue.add(i);
	                }
	                if (!listValue.contains(pValue/i)) {
	                    listValue.add(pValue/i);
	                }
	            }
	        }
	        Iterator<Integer> iterator = listValue.iterator();
	        while (iterator.hasNext()) {
	            totalValue += iterator.next();
	        }
	        return totalValue;
	    }
}
