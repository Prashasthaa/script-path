# OPP in python 

# Class  & object in python
# class is a blueprint for creating objects

# creating class

class Student:
    name="karan"

# creating object (instance)

s1=Student()
print(s1.name)

class Car:
    color='blue'
    brand="skoda"

car1=Car()
print("Color of car1=",car1.color)
print(car1.color)


# __intit __ function
# Constructor

class Student2:
    # class attribute
    college_name="AJIET"
    name="anonymous" #class attr
     
    # default constructors
    def __init__(self):
        pass

    # parameterized constructor
    def __init__(self,name,mark):
        print(self)
        self.name=name  #obj attr
        self.mark=mark
        #  obj atrr > class attr
        print("Creating new Student!")
    
    def welcome(self):
        print("welcome Student",self.name)

    def get_marks(self):
        return self.mark    




s3=Student2("sanju",97)
print(s3.name)
s3.welcome()
print(s3.get_marks())
    

# Practice Question
# Q1.

print("------------Practice Questions---------------")

class Student4:
    def __init__(self,name,m1,m2,m3):
        self.name=name
        self.m1=m1
        self.m2=m2
        self.m3=m3
        
    def average_marks(self):
        avg=(self.m1+self.m2+self.m3)/3
        print("Average marks = ",avg)



s5=Student4("Sanju",45,76,98)
s5.average_marks()

class Student1:
    def __init__(self):
        pass


    @staticmethod #decorator
    def hello():
        print("hello this is static method")


s3=Student1()
s3.hello()

# Abstraction
# Hidding the implementation deatils of a class and only showing the essential features to the user

# Encapsulation
# Wrapping data and functions into a single unit(object).


class Account:
    def __init__(self, bal,acc):
        self.balance=bal
        self.accounut_no=acc

    def debit(self,amount):
        self.balance-=amount
        print("Rs.",amount," was debited")
        print("Total balance=",self.get_balance())

    def credit(self,amount):
        self.balance+=amount
        print("Rs.",amount," was Credited")
        print("Total balance=",self.get_balance())

    
    def get_balance(self):
        return self.balance


acc1=Account(11000,12134)
print(acc1.balance,acc1.accounut_no)
acc1.credit(2423)
acc1.debit(333)
print("Total balance=",acc1.get_balance())


