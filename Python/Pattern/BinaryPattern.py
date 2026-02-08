num=int(input("Enter a number of rows:"))
for i in range(1,num+1):
  for j in range(i):
    if(i+j)%2==0:
      print("0" ,end=' ')
    else:
      print("1" ,end=' ')
  print()