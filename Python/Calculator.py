select=input("select the optretor to calculate (+,-,*,/,//,%,**):")

if select=='+':
  num1=int(input("Enter a frist number:"))
  num2=int(input("Enter a secound number:"))
  sum=num1+num2
  print(f"Addition of number{sum}")
elif select=='-':
  num1=int(input("Enter a frist number:"))
  num2=int(input("Enter a secound number:"))
  sub=num1-num2
  print(f"Subraction of number{sub}")
elif select=='*':
  num1=int(input("Enter a frist number:"))
  num2=int(input("Enter a secound number:"))
  mul=num1*num2
  print(f"mulatplication of number{mul}")
elif select=='/':
  num1=int(input("Enter a frist number:"))
  num2=int(input("Enter a secound number:"))
  div=num1/num2
  print(f"division of number{div:.2f}")
elif select=='//':
  num1=int(input("Enter a frist number:"))
  num2=int(input("Enter a secound number:"))
  floordiv=num1//num2
  print(f"floor division of number{floordiv:.2f}")
elif select=='%':
  num1=int(input("Enter a frist number:"))
  num2=int(input("Enter a secound number:"))
  modulus=num1%num2
  print(f"Modulus of number{modulus:.2f}")  
elif select=='**':
  num1=int(input("Enter a frist number:"))
  num2=int(input("Enter a secound number:"))
  Power=num1**num2
  print(f"Power of two number{Power:.2f}")
else:
  print("Invalid opertor")