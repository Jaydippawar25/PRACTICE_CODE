num1=int(input("Enter a number:"))
num2=int(input("enter a number:"))
small=0 

if num1>num2:
  small=num2
else:
  small=num1

for i in range(1,small//2):
  if num1%i==0 and num2%i==0:
    gcd=i
print(gcd)