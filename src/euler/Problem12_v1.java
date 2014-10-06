package euler;

public class Problem12_v1 {

	public static void main(String[] args) {
		boolean looper = true;
		int countNum = 0;
		int sum = 0;
		int num = 1;
		int count = 0;
		while (looper) {
			countNum++;
			sum += num;
			for (int i = 1; i < sum; i++) {
				if (sum % i == 0) {
					count++;
				}
			}
			if (count > 500) {
				System.out.println(countNum + "th triangle number:");
				System.out.println(sum);
				looper = false;
			}
			count = 0;
			num++;
		}
	}
}
// 76576500
