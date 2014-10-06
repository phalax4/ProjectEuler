count = 0
def binary(x):
	return int(bin(x)[2:])
myArray = []
for i in range(0,1000000):
	myStr = str(i)
	binStr = str(binary(i))
	if myStr==myStr[::-1] and binStr==binStr[::-1]:
		count+=1
		myArray.append(myStr)
print count
print myArray
total = 0
for i in myArray:
	total+=int(i)

print total