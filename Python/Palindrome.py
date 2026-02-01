num = int(input("Enter a number"))
res=0 
temp=num

while num>0:
  i=num%10
  res=res*10+i
  num=num//10
if temp==res:
  print(temp,"is palindrome")
else:
  print(temp,"is not Palindrome")

