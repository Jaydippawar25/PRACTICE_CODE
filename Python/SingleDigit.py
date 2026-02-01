num=int(input("Enter a number"))

while num>=10:
  sum=0 
  while num>0:
    sum=sum+num%10
    num=num//10
  num=sum
print("Single Digit",num)