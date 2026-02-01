num = int(input("Enter a number"))
res=0 
while num > 0:
  sum=num%10
  res=res*10+sum
  num=num//10
print("Reversed numbers",res)