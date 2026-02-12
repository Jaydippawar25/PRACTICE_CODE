arr=[1,2,4,5]
num=5
sum=num*(num+1)//2
count=0 
for i in arr:
  count+=i
missingnumber=sum-count
print(missingnumber)