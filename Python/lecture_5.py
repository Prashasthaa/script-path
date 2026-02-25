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

# Loops

# for loops

nums=[1,4,9,16,25,36,49,64,81,100]
for val in nums:
    print(val)


nums=[1,4,9,16,25,36,49,64,81,100]
for val in nums:
    print(val)
else:
    print("End")

ums=(1,4,9,16,25,36,49,64,81,100)
i=0
x=25
for val in nums:
    if(val==x):
        print("Found at ",i)
    i+=1;    

# Range
# returns sequence of numbers
seq=range(5)
print(seq[1])
print(seq[2])
print(seq[3])
print(seq[4])
print(seq[0])

for i in range(2,10,2):
    print(i)

# Practice
# 
# Q1.

for i in range(100):
    print(i)

# Q2.

for i in range(100,0,-1):
    print(i)

# Q3.
# n=int(input("Enter a number:"))
n=9
for i in range(1,11):
    print(n ,"*",i,"=",i*n)


# Pass Statement

for i in range(20):
    pass

print("Pass statement ")

# Q4.
n=5
sum=0
for i in range(n+1):
   sum+=i
print(sum)

fact=1
for i in range(1,n):
    fact*=i

print(fact)