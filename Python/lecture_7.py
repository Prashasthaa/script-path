# File I/O in Python

# Types of file
# 1. Text files: .txt, .docx, .log etc.
# 2. Binary Files: .mp4, .mov, .png, .jpeg etc.

# Operations on files:
# ->Open("filename","mode")

# different modes
# read=>'r'
# write=> 'w'

f=open("demo.txt","r")

data= f.read()
print(data)
print(type(data))
f.close()

# read number of characters
f=open("demo.txt","r")

data= f.read(5)
print(data)
print(type(data))
f.close()

# read a line
f=open("demo.txt","r")

line1= f.readline()
line2= f.readline()

print(line1)
print(line2)
print(type(data))
f.close()

# Writing to a file
f=open("demo.txt","a")

f.write("I want to learn Java tommorow. 123456")
f.close()

# Open and write on a file which does not exist
f=open("sample.txt",'w')
f.write("Hello world") 
f.close()

# with Syntax
with open("demo.txt","r") as f:
    data=f.read()
    print(data)

import os
os.remove("sample.txt")

print("-----------------Practice Questions------------")

# Q1.
f=open("practice.txt","a")
f.write("Hi\n")
f.write("We are learning File I/O\n")
f.write("using python\n")
f.write("I like programming in python.\n")
f.close()

# Q2.
f=open("practice.txt","r")
data=f.read()
new_data=data.replace("python","Java")
print(new_data)
f.close()

with open("practice.txt", "w") as f:
    f.write(new_data)


# Q3.

word="learning"
with open("practice.txt","r") as f:
    data=f.read()
    if(word in data):
        print("found")
    else:
        print("not found")


def check_for_line():
    word="learnisng"
    data=True
    line_no=1
    with open("practice.txt","r") as f:
        while data:
            data=f.readline()
            if(word in data):
                print(line_no)
                return
                
            line_no+=1
    return -1



check_for_line()

# Q4.
os.remove("practice.txt")

f=open('practice.txt',"w")
f.write("1,2,3,34,43,,53,32,56")
f.close()

with open("practice.txt","r") as f:
    data=f.read()
    print(data)

