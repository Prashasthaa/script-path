str1="This is String"
str2='This is String'
str3="""This is String"""

# concationation
final_str=str1+str2

print(final_str)

print(len(final_str))
print(str1[9])

#slicing
# accesing parts of a string

slicing_str1=str1[5:9]
print(slicing_str1)

str="Hello World!"
print(str[:4]) #[0:4]
print(str[5:]) #[5:len(str)]

# negative indexing
print(str[-3:-1])
print(str[-1:-3])


str1="This is String"
str=str1.replace("i","t")
print(str)
print(str.find("t"))
print(str.capitalize())

# conditional Statements
age=12
if age>=18:
    print("can vote")
else:
    print("cannot vote")

light="green"

if(light=="red"):
    print("stop")
elif (light=="yellow"):
    print("look")
else:
    print("Go")
    
marks=87

if marks>=90 :
    if (marks<=90 and marks>80):
        print("B")

