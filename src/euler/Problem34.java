package euler;

public class Problem34 {

	public static void main(String[] args) {
		int sumF = 0;int total = 0;
		for(int i = 3;i<=1000000;i++){
			int length = String.valueOf(i).length();
			for(int j = 0;j<length;j++){
				sumF+=factorial(String.valueOf(i).charAt(j)-48);
			}
			if(sumF==i){
				total+=i;
			}
			sumF=0;
		}
		System.out.println(total);
	}
	public static int factorial(int x){
		int sum = 1;
		for(int i = 1;i<=x;i++){
			sum*=i;
		}
		return sum;
	}
}
