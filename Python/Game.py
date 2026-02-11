import random
number=random.randint(1,5)
count=3 

while count>0:
  Guessnum=int(input("Enter a number between 1 to 5:"))
  count-=1
  if number==Guessnum:
    print("You Win")
    break
  elif number!=Guessnum and count!=0:
    print(f"You loss...remaining attempt are{count}")
  else:
    print(f"All attempts are over and game over...and correct number are:{number}")