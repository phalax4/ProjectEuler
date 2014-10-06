import math
def T(n):
	return (n*(n+1))/2
def P(n):
	return n*(3*n-1)/2
def H(n):
	return n*(2*n-1)
def QP(x):
	a = 3
	b = 1
	c = 2*x*-1
	return int((b+math.sqrt(1-(4*a*c)))/6)
def QH(x):
	a = 2
	b = 1
	c = x*-1
	return int((b+math.sqrt(1-(4*a*c)))/4)
check = True
t = 286


while(check):
	triNum = T(t)
	print '...'
	if P(QP(triNum))==triNum and H(QH(triNum))==triNum:
		print triNum
		check = False;
	t+=1




