num=input("enter a number of rows:")
flag=1
for ch in num:
  if ch !='0' and ch!='1':
    flag=0
    break
if flag==1:
  print(f"{num} is Binary number")
else:
  print(f"{num} is not Binary number")