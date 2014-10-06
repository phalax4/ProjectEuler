import fractions
def order(x):
	i = 1
	while(((10**i)-1)%x!=0):
		i+=1
	return i
def primes(limit):
	is_prime = [False] * 2 + [True]* (limit-1)
	for x in range(int(limit**0.5+1.5)):
		if is_prime[x]:
			for i in range(x*x,limit+1,x):
				is_prime[i] = False
	return [i for i, prime in enumerate(is_prime) if prime]
myList = primes(1000) #1000
value = 0

for i in myList:
	maxima = 0
	p = i-1
	if fractions.gcd(10,i) == 1:

		if order(i) == p and p>maxima:
			maxima = p
			value = i
print value





