import itertools
def primes_upto(limit):
    is_prime = [False] * 2 + [True] * (limit - 1) 
    for n in range(int(limit**0.5 + 1.5)): # stop at ``sqrt(limit)``
        if is_prime[n]:
            for i in range(n*n, limit+1, n):
                is_prime[i] = False
    return [i for i, prime in enumerate(is_prime) if prime]
def isPrime(n):
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    max = n**0.5+1
    i = 3
    while i <= max:
        if n % i == 0:
            return False
        i+=2
    return True

lister = primes_upto(197)

count = 0
total = 0
for i in lister:
    lst = list(str(i))
    perm = list(itertools.combinations(lst,len(lst)))
    print perm
    for x in perm:
		myNum= int(''.join(x))
		if isPrime(myNum):
			count +=1
    if len(perm) == count:
		total+=1
    count = 0

print total
permy =  list(itertools.combinations([1,9,7],2))

