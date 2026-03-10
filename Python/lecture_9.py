# OOPs in python


# del keyword
# used to delete object properties or object itself

class Student1 :
    def __init__(self,name):
        self.name=name

s1=Student1("Prashastha")

print(s1.name)
del s1

# print(s1.name)
# error
# NameError: name 's1' is not defined

# Private(like) attributes And methods
# to make private any attribute add two __(underScore) begining of the variable


class Account:
    def __init__(self,acc_no,acc_pass):
        self.acc_no=acc_no
        self.__acc_pass=acc_pass


    def reset_pass(self):
        print(self.__acc_pass)

    
acc1=Account("12345","qwerty")
print(acc1.acc_no)
# print(acc1.acc_pass)  error: AttributeError: 'Account' object has no attribute 'acc_pass'  

acc1.reset_pass()        


# Inheritance

class Car:
    color="blue"

    @staticmethod
    def start():
        print("Started....")
    
    @staticmethod
    def stop():
        print("Stoppedd...")


class Skoda(Car):
    def __init__(self, name):
        self.name=name

car1=Skoda("slavia")
car2=Skoda("octavia")

car1.start()

# types of inheritance
# single inheritance
# multi-level inheritance
# mutiple inheritance

class A:

    varA="welcome to class A"

class B:
    varB="welcome to class B"

class C(A,B):
    varC="welcome to class C"

a=A()
b=B()
c=C()

print(c.varA)
print(c.varB)
print(c.varC)


# Super method
# super method is used access methods of parent class


class Person:
    name="anonymous"

    # def changeName(self, name):
    #     self.__class__.name=name
    #     # self.__class__.Person

    @classmethod
    def changeName(cls,name):
        cls.name=name

p1=Person()
p1.changeName("rahul kumar")

print(p1.name)
print(Person.name)

p2=Person()
p2.changeName("kiran")

print(p2.name)
print(Person.name)

#class methods

# 1) static methods
# 2)class methods (class)
# 2) instance methods (self)


# Property

class Student:
    def __init__(self,phy,chem,math):
        self.phy=phy
        self.math=math
        self.chem=chem
 
    
    @property
    def percentage(self):
        return str((self.phy+self.math+self.chem)/3)+"%"



s1= Student(78,89,98)
print(s1.percentage)

s1.phy=68

print(s1.percentage)
