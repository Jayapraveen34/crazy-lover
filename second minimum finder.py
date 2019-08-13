a=[]
b=int(input("value of N"))
count=0
for count in range(0,b):
    i=int(input("Enter the number:"))
    a.append(i)
    del i
    count+=1
a.remove(min(a))
print(min(a))
    
