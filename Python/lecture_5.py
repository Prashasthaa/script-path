# Loops in python
# Loops are used to repeat instructions

# While loopd

count=1
while count<=5:
    print ("Hello world ",count)
    count +=1

i=1
while i<=10:
    print("PRashashtha")
    i+=5
# Practice Questions

# Q1.
i=1
while i<=10:
   print(i)
   i=i+1

# Q2.

i=100
while i>=1:
    print(i)
    i=i-1

# Q3.

n=3
i=1
while i<=10:
    print(n ,"*",i,"=",i*n)
    i=i+1

# Q4.
nums=[1,4,9,16,25,36,49,64,81,100]

i=0
while i<len(nums):
    print(nums[i])
    i+=1

# Q5.
ums=(1,4,9,16,25,36,49,64,81,100)
i=0
x=25
while (i<len(nums)):
    if(nums[i]==x):
        print("Found at ",i)
    i+=1

# Break keyword
i=1
while i<=5:
    print(i)
    if(i==3):
        break
    i+=1

# Continue
i=0
while i<=5:
   
    if(i==3):
        i+=1
        continue
    print(i)
    i+=1