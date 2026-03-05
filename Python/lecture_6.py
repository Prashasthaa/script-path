# Fuctions and Recursion

# Fuctions
# Block of statement that petform specific task
# function is used to reduce redundency

# function defination
def calculate_sum(a,b):  #a,b are parameters
    sum = a+b
    print(sum)
    return sum

# fuction call
calculate_sum(1,29)
calculate_sum(1,2)
calculate_sum(21,26)

def print_hello():
    print("Hello World!")

print_hello()
print_hello()
print_hello()

def calculate_avg(a,b,c):
    avg=(a+b+c)/3
    print(avg)
    

calculate_avg(1,2,3)

print("apnacollege" , end=" ")  #sep=" "
print("Prashastha")

# default values

def cal_prod(a=1,b=1):
    print(a*b)
    return a*b

cal_prod()
cal_prod(2,3)

# Practice questions

# Q1.

cities=["Delhi","Keralam","Mangalore","Kasaragod","Manjeshwara","France","Paris","Hydrebad"]
nums=[1,23,445,34345,34532,35]

def print_len(list):
    print(len(list))

print_len(cities)
print_len(nums)

# Q2.

def print_list(list):
    for item in list:
        print(item,end=" ")

print_list(cities)
print()
print_list(nums)

# Q3.

fact=1
def cal_fact(n):
    fact=1
    for i in range(1,n+1):
        fact *=i
    print(fact)

cal_fact(6)
cal_fact(4)

# Q4.
def converter(usd_val):
    inr=usd_val*83
    print(usd_val,"USD =",inr,"INR")

converter(90)
converter(10)

calculate_sum(1,29)
calculate_sum(1,2)
calculate_sum(21,26)


# Recursion

# when a function calls itself repeatedly


print("----------------Recursion--------------------")
def print_num_reverse(n):
    if n==0:
        return
    print(n)
    print_num_reverse(n-1)

print("-------------Print n to 1 backwards--------")

print_num_reverse(5)

def print_num(n):
    if n==0:
        return
    print_num(n-1) #8,7,6,5,4,3,2,1,0
    print(n)

print("-------------Print 1 to n--------")

print_num(9)

def factorial(n):
    if (n==0 | n==1):
        return 1
    else:
        return n*factorial(n-1)

print("--------------Factorial----------")

print(factorial(1))
print(factorial(3))
print(factorial(7))

print("------Practice questions---------")

# Q1.

def sum_of_n(n):
    if n==1:
        return 1
    return n+sum_of_n(n-1)

print("Sum of n numbers:")

print(sum_of_n(4))
print(sum_of_n(3))
print(sum_of_n(2))

  