import math

f = open('num42.txt')

def quad(x):
	x = x*2
	return (-1+math.sqrt(1-(4*1*-1*x)))/2

line = f.readline().replace('"','')
array = line.split(',')

triangleWords = 0
for i in array:
	letters = list(i)
	total = 0
	for x in letters:
		total+=ord(x)-64

	if(quad(total).is_integer()):
		print letters
		triangleWords+=1

print triangleWords


