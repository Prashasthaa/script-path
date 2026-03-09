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
    

