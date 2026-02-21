# List
# list are mutable and the strings in the tuple are mutable
marks=[97.8,89.9,0.09,999]
print(marks)
print(type(marks))
print(marks[0])
print(marks[3])
print(len(marks))

student=["Prashastha",8.7,"Kerala"]
print(student)
print(student[2])

# slicing

marks=[56,5,43,32,66,65]
print(marks[1:])
print(marks[:len(marks)-1])
print(marks[-3:-1])


list = [2,3,1,6,4]
list.append(4)
print(list)
list.sort()
print(list)
list.sort(reverse=True)
print(list)
list.reverse
print(list)

list.pop(2)
print(list)

# tuples 
# tuples are immutable
tuple=(2,3,45,53,3,4)
print(tuple)
print(tuple[1])
print(type(tuple))

# single value tuple
nums=(1,)
print(type(nums))


# slicing 
print(tuple[-3:-1])


# methods
print(tuple.index(2))
print(tuple.count(3)) 

# practice Questions

# Q1. input 3 movies and store it in a list
movies=[]
movies1=str(input("Enter a movie name 1:"))
movies2=str(input("Enter a movie name 2:"))
movies3=str(input("Enter a movie name 3:"))
movies.append(movies1)
movies.append(movies2)
movies.append(movies3)
print(movies)

# Q2. check if a list conatins a palindrome of elements 

arr=[1,"Abc","Abc",1]
arr2=arr.copy()
arr2.reverse

if(arr==arr2):
    print("Palindrome")
else:
    print("NOt palindrome")

# Q3. count the number of students with the "A" grade in the following tuple

grade=("C","D","A","A","B")
print(grade.count("A"))

# Q3. store grade tuple as list and sort them "A" to "D" 

grade=["C","D","A","A","B"]
grade.sort()
print(grade)
