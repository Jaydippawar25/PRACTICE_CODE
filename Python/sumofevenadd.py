num=[1,2,3,4,5]
even_sum=0
odd_sum=0
for i in num:
  if i%2==0:
    even_sum=even_sum+i
  
  else:
    odd_sum=odd_sum+i
print("sum of even",even_sum)
print("sum of odd",odd_sum)
