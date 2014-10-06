#include <stdio.h>
#include <math.h>
#include <vector>
#include <iostream>
using namespace std;

bool isPrime(long a){
	if(a%2==0){return false;}
	for(int i = 3; i*i<=a;i+=2){
		if(a%i==0){
			return false;
		}
	}
	return true;
}
int main(void){
	vector<long> arr;
	arr.push_back(1);
	bool check = true;
	int i = 3;			// is the sidelength
	double noPrime = 1;
	double Prime = 0;
	while(check){
		long diff = i-1;
		long num1 = i*i;
		long num2 = num1 - diff;
		long num3 = num2 - diff;
		long num4 = num3 - diff;
		arr.push_back(num1);
		arr.push_back(num2);
		arr.push_back(num3);
		arr.push_back(num4);
		for(int i = 0;i<4;i++){
			if(isPrime(arr[i])){
				Prime++;
			}else{
				noPrime++;
			}
		}
		if((Prime/(noPrime+Prime))*100<=10){
			cout<<(Prime/(noPrime+Prime))*100<<endl;
			check = false;
			cout<<"Side Length: "<<i<<endl;
		}
		i+=2;
		arr.clear();
	}
	return 0;
}