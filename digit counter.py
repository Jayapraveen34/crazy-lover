a=int(input('Enter the number:\n'))
count=0
if a==0:
    count +=1
else:
    while a>0:
        a *= 0.1
        a = int(a)
        count += 1
print(count)
    
