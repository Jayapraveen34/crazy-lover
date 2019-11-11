N=int(input("Enter the N:"))
K=int(input("Enter the K:"))
a=[]
for i in range(N):
    z=int(input("enter the number:"))
    a.append(z)
    del z

        
b=a.count(K)
print(b-1)
