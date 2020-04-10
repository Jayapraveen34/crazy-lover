import random
a=int(input())
b=[]
for i in range(2,a):
    if(a%i==0):
        b.append(i)
if(len(b)>0):
	print("yes")
else:
	print("no")
