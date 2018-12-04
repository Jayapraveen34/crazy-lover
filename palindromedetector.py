a=int(input('Enter the number'))
b=str(a)
c=int(b[::-1])
if a==c:
    print('Palindrome')
else:
    print('Not palindrome')
