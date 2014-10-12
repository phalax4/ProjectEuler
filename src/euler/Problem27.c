#include <stdio.h>
#include <stdlib.h>

typedef int bool;
#define true 1
;
#define false 0
;

int isPrime(int p);
int equation(int a, int b);

int main (void){
	int max = 0; int a1 = 0; int b1 = 0;
	for(int a = -999; a<=1000;a++){
		for(int b = -999; b<=1000;b++){
			int number = equation(a,b);
			if(number>max){
				max = number;
				a1 = a;
				b1 = b;
			}
		}
	}
	printf("Max: %d\n",max);
	printf("a: %d\n",a1);
	printf("b: %d\n",b1);
	printf("product: %d\n",(a1*b1));

	return 0;
}

int equation(int a, int b){
	bool is = false;
	int counter = 0;
	int n = 0;
	do{
		is = isPrime(abs((n*n) + (a*n) +b));
		if(is==true){
			counter++;
		}
		n++;
	}while(is==true);
	return counter;
}

bool isPrime(int p){
	for(int i = 2;i<p;i++){
		if(p%i==0){
			return false;
		}
	}

	return true;
}