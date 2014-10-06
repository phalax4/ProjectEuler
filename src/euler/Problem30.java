package euler;

public class Problem30 {

	public static void main(String[] args) {
		float sum = 0; float total = 0;
		for(int i  = 0;i<=200000;i++){
			for(int j = 0;j<String.valueOf(i).length();j++){
				int num = String.valueOf(i).charAt(j)-48;
				sum+=Math.pow(num, 5);
			}
			if(sum==i){
				total+=i;
			}
			sum=0;	
		}
		System.out.println(total-1);
		
	}

}
