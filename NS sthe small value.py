N=int(input("Enter the N"))
K=int(input("Enter the K"))
a=[]
count=0
print("Enter the values")
for count in range(0,N):
    i=int(input(":"))
    a.append(i)
    count +=1
a.sort()
print(a[K-1])

