package euler;

public class Problem27 {
	
	public static void main(String[] args) {
		int max = 0; int a1 = 0; int b1 = 0;
		for(int a = -999;a<1001;a++){
			for(int b = -999;b<1001;b++){
				int number = equation(a,b);
				if(equation(a,b)>max){
					max = number;
					a1 = a;
					b1 = b;
				}
			}
		}
		System.out.println("max:"+max);
		System.out.println("a: " +a1);
		System.out.println("b: "+b1);
		System.out.println(a1*b1);
		
	}
	public static int equation(int a, int b){
		boolean is;
		int counter = 0;
		int n = 0;
		do{
			is = isPrime(Math.abs((n*n) + (a*n) +b));
			if(is){
				counter++;
			}
			n++;
		}while(is);
		return counter;
	}
	public static boolean isPrime(int p) {
		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
}
