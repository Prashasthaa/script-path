# Dicitionary & Set

# Dicitonary

# no order in dictionary
# mutable
# don't allow duplicate keys

info={
    "key":"value",
    "name":"apnacollege",
    "learning":"coding",
    "age":35,
    "is_adult":True,
    "mark":67.7,
    "subject":["pyton","C","Java"],
    "topics":("dict","set"),
    12:12,
    12.2:12.2,
}

print(info)
print(type(info))
print(info["age"])
print(info[12])
print(type(info["age"]))
print(type(info["subject"]))

info["name"]="Prashastha"
info["surname"]="poojary"
print(info)

null_dict=()
print(null_dict)

# nested dictionaries

student={
    "name":"rahul",
    "subjects":{
        "phy":97,
        "chem":76,
        "math":46
    },
}

print(student)
print(student["subjects"]["chem"])

# dictionary methods
print(student.keys())

print(student.values())

print(student.items())

print(student.get("name"))

# print(student["name2"]) ##error

print(student.get("name2")) #no error -> None


# Sets
# collection of unordered items .
# set is mutable but element is immutable
# Each element in the set is unique and immutable

nums={1,2,3, 4,"hello ","owrl",9,3}
print(nums)
print(type(nums))
print(len(nums))

# set store the dulicate element once

collection=set() #empty set


# Methods of set
collection.add(1)
collection.add(2)
collection.add(2)
collection.add(4)
collection.add(5)
collection.add(6)
collection.add(7)

print(collection)

collection.remove(4)

print(collection)

collection.pop() #randomly element is popped
print(collection)

collection.clear()

print(len(collection))


set1={1,2,3,4,5,6}

set2={0,9,8,7,6,5}

# union combines both the set values & returns new set
# intersection combines common values & returns new set

union_set=set1.union(set2)
intersection_set=set1.intersection(set2)

print(union_set)
print(intersection_set)

# Practice Questions

# Q1.
word_meaning={
    "table":["a piece of furniture","list of facts and figures"],
    "cat":"a small animal",
}

print(word_meaning)

# Q2.
subjects=["python","java","C++","C","python","javaScript","java","python","java","C++"]

classroom=set(subjects)

print(len(classroom))

# Q3.
set={9,9.0}
print(set)

set={9,'9.0'}
print(set)

values=[
    {"float",9.0},
    {"int",9}
]
print(values)

