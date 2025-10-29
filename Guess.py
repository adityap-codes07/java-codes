import random 
low = int(input("ENTER THE LOWER BOUND:"))
high = int(input("ENTER THE UPPER BOUND:"))
print(f"You have 7 chances to guess the number between {low} to {high}")
num=random.randint(low,high)
ch=7
gc=0
while gc < ch:
    gc+=1
    guess=int (input('enter the guess:'))
    if(guess == num):
        print("Correct!!")
        break
    elif(gc>=ch and guess!=num):
        print('better luch,next time.the number was {num}')
    elif guess > num:
        print('too high')
    elif guess<num:
        print('too low')
