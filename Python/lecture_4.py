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

