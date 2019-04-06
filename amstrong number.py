a=abs(int(input("Enter the number")))
counter=0
n=a
while n>0 :
    temp = n%10
    counter = counter+temp**3
    n //=10
if(counter == a):
    print("Yes amstrong number")
else:
    print("No")
    
    
