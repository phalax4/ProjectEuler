sum = 1
for i in xrange(3,1003,2):
	diff = i-1
	num1 = i*i
	print num1
	num2 = num1 - diff
	num3 = num2-diff
	num4 = num3-diff
	sum+=(num1+num2+num3+num4)
print sum