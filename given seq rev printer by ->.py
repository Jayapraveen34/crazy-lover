_=input()
lst=[int(x) for x in input().split()]
lst=lst[::-1]
print(*lst,sep="->")
