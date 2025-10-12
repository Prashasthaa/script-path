import java.util.*;

///////////////////////////////////////////////////////////
/// ////////////////////////////////////////////////
/// Practice Questions
/// SUM , DIFFERENCE and PRODUCT of COMPLEX NUMBERS
public class OOPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of first number:");
        int r1 = sc.nextInt();
        System.out.println("Enter imaginary part of first number:");
        int i1 = sc.nextInt();
        System.out.println("Enter real part of second number:");
        int r2 = sc.nextInt();
        System.out.println("Enter imaginary part of second number:");
        int i2 = sc.nextInt();
        Complex c = new Complex();
        c.sum(r1, i1, r2, i2);
        c.difference(r1, i1, r2, i2);
        c.product(r1, i1, r2, i2);

    }
}

class Complex {
    public void sum(int r1, int i1, int r2, int i2) {
        System.out.println("Sum = " + (r1 + r2) + "+" + (i1 + i2) + "i");
    }

    public void difference(int r1, int i1, int r2, int i2) {
        System.out.println("Difference = " + (r1 - r2) + "+" + (i1 - i2) + "i");
    }

    public void product(int r1, int i1, int r2, int i2) {
        System.out.println("Product = " + ((r1 * r2) - (i1 * i2)) + "+" + ((i1 * r2) + (i2 * r1)) + "i");
    }
}

////////////////////////////////////////
////////////////////////////////////////
/// Super Keyword

// public class OOPS {

// public static void main(String[] args) {
// Horse h = new Horse();
// }
// }

// class Animal {
// Animal() {
// System.out.println("Animal constructor is called");
// }
// }

// class Horse extends Animal {

// Horse() {
// super();
// System.out.println("Horsse constructor is called");
// }
// }

// ////////////////////////////////////////
// ////////////////////////////////////////
// /// Static Keyword

// public class OOPS {

// public static void main(String[] args) {
// Student s1 = new Student();
// s1.schoolName = "JMV";

// Student s2 = new Student();
// System.out.println(s2.schoolName);

// }
// }

// class Student {
// String name;
// int roll;

// static String schoolName;

// void setName(String name) {
// this.name = name;

// }

// String getName() {
// return this.name;

// }
// }

//////////////////////////////////////////
//////////////////////////////////////////

// Abstraction

////////////////////////////////////////
/// Interface

// public class OOPS {

// public static void main(String[] args) {
// Queen q = new Queen();
// q.moves();
// }
// }

// ////////////////////////////////////////
// /// Multiple Interface

// public class OOPS {

// public static void main(String[] args) {
// Bear b = new Bear();
// b.veg();
// b.nonVeg();
// }
// }

// interface Herbivore {
// void nonVeg();
// }

// interface Carnivore {
// void veg();

// }

// class Bear implements Herbivore, Carnivore {

// public void nonVeg() {
// System.out.println("Eats meat");

// }

// public void veg() {
// System.out.println("Eats Veg");
// }
// }

// interface ChessPlayer {
// void moves();

// }

// class Queen implements ChessPlayer {

// public void moves() {
// System.out.println("up,down,left,right,diagonal (in all 4 direction)");

// }
// }

// class Rook implements ChessPlayer {

// public void moves() {
// System.out.println("up,down,left,right");

// }
// }

// class King implements ChessPlayer {

// public void moves() {
// System.out.println("up,down,left,right,diagonal by one step");

// }
// }

// //////////////////////////////////////////
// //////////////////////////////////////////

// // Abstraction

// ////////////////////////////////////////
// /// Abstract class

// public class OOPS {

// public static void main(String[] args) {
// // Horse h = new Horse();
// // h.eat();
// // h.walk();
// // System.out.println(h.color);
// // h.changeColor();
// // System.out.println(h.color);

// // Chicken c = new Chicken();
// // c.eat();
// // c.walk();

// // //Error ->Cannot create instant the type Animal
// // Animal a = new Animal();

// Mustang myHorse = new Mustang();
// // Animal->horse->mustang

// }
// }

// abstract class Animal {
// String color;

// // constructor
// Animal() {
// color = "brown";
// System.out.println("Animal constructor called");
// }

// void eat() {
// System.out.println("EATS");
// }

// abstract void walk();
// }

// class Horse extends Animal {
// Horse() {
// System.out.println("Horse constructor called");
// }

// void changeColor() {
// color = "dark brown";
// }

// @Override
// void walk() {
// System.out.println("Walks on 4 legs");
// }
// }

// class Mustang extends Horse {
// Mustang() {
// System.out.println("Mustang constructoer class");
// }
// }

// class Chicken extends Animal {
// void walk() {
// System.out.println("Walks on 2 legs");
// }

// void changeColor() {
// color = "Yellow";
// }
// }

// //////////////////////////////////////////
// //////////////////////////////////////////

// // PACKAGES
// import java.util.*;

// public class OOPS {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// System.out.println(a);

// }
// }

// ///////////////////////////////////////////
// //////////////////////////////////////////

// // Polymorphism

// public class OOPS {

// public static void main(String[] args) {

// // Calculator calc = new Calculator();
// // System.out.println(calc.sum(1, 2));
// // System.out.println(calc.sum((float) 1.9, (float) 2.1));
// // System.out.println(calc.sum(1, 9, 1));

// Deer d = new Deer();
// d.eat();
// }
// }

// // Method overloading
// class Calculator {
// int sum(int a, int b) {
// return a + b;

// }

// float sum(float a, float b) {
// return a + b;
// }

// int sum(int a, int b, int c) {
// return a + b + c;

// }
// }

// // Method overiding
// class Animal {
// void eat() {
// System.out.println("Eats anything");
// }
// }

// class Deer extends Animal {
// void eat() {
// System.out.println("eats grass");
// }
// }

///////////////////////////////////////////
// ///////////////////////////////////////////////////
// ///Inheritance
// public class OOPS {
// public static void main(String args[]) {
// // Fish shark = new Fish();
// // shark.eat();

// Dog dobby = new Dog();
// dobby.eat();
// dobby.legs = 4;
// System.out.println(dobby.legs);

// }
// }

// /// Base-classs
// class Animal {
// String color;

// void eat() {
// System.out.println("eats");
// }

// void breathe() {
// System.out.println("breathes");
// }
// }

// // // Derived class

// // Types of Derived class

// // single-level inheritance
// // class Fish extends Animal {
// // int fins;

// // void swim() {
// // System.out.println("swims in water");
// // }

// // }

// // // multi-level inheritance
// // class Mammals extends Animal {
// // int legs;

// // }

// // class Dog extends Mammals {
// // String breed;

// // }

// // // Hierachial inheritance
// // class Mammals extends Animal {
// // void walk() {
// // System.out.println("Walks");
// // }
// // }

// // class Fish extends Animal {
// // void swim() {
// // System.out.println("swims in water");
// // }

// // }

// // class Bird extends Animal {
// // void fly() {
// // System.out.println("fly in Sky");
// // }

// // }

// // Hybrid inheritance
// class Fish extends Animal {
// void swim() {
// System.out.println("swims in water");
// }

// }

// class Bird extends Animal {
// void fly() {
// System.out.println("fly in Sky");
// }

// }

// class Mammals extends Animal {
// int legs;

// }

// class Dog extends Mammals {
// String breed;

// }

// class Cat extends Mammals {
// String breed;

// }

// class Human extends Mammals {
// String talk;

// }

// class Peacock extends Bird {
// String dance;

// }

// class tuna extends Fish {
// String color;

// }

// class Shark extends Mammals {
// String color;

// }

//////////////////////////////////////////
///////////////////////////////////////////

// // constructors
// class Student {

// String name;
// int roll;
// String password;
// int marks[];

// // // shallow copy constructor
// // Student(Student s1) {
// // marks = new int[3];
// // this.name = s1.name;
// // this.roll = s1.roll;
// // this.marks = s1.marks;
// // }

// // deep copy constructor
// Student(Student s1) {
// marks = new int[3];
// this.name = s1.name;
// this.roll = s1.roll;
// for (int i = 0; i < 3; i++) {
// this.marks[i] = s1.marks[i];
// }

// }

// // Non parameterized constructor
// Student() {
// marks = new int[3];
// System.out.println("Constructor is called");
// }

// // Parameterized constructor
// Student(String name) {
// marks = new int[3];
// this.name = name;
// }

// Student(int roll) {
// marks = new int[3];
// this.roll = roll;
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// // Pen p1 = new Pen(); // created a pen object called p1

// // p1.setColor("Blue");
// // System.out.println(p1.getColor());

// // p1.setTip(5);
// // System.out.println(p1.getTip());

// // p1.setColor("Yellow");
// // System.out.println(p1.getColor());

// // BankAccount myAcc = new BankAccount();
// // myAcc.username = "Prashastha";

// // myAcc.password = "abcdefg";
// // error:The field BankAccount.password is not visible

// // myAcc.setPassword("abcdefg");

// // Parameterized constructor
// // Student s1 = new Student("Prashastha");
// // Student s2 = new Student(5);

// // // Non parameterized constructor
// // Student s3 = new Student();

// // copy constructor

// Student s1 = new Student();
// s1.name = "prashastha";
// s1.roll = 432;
// s1.password = "abcd";
// s1.marks[0] = 10;
// s1.marks[1] = 90;
// s1.marks[2] = 80;

// Student s2 = new Student(s1); // copy
// s2.password = "xyz";
// s1.marks[2] = 100;

// for (int i = 0; i < 3; i++) {
// System.out.println(s2.marks[i]);
// }

// // System.out.println(s1.name);

// }
// }

// // class Pen {
// // private String color;
// // private int tip;

// // String getColor() {
// // return this.color;
// // }

// // int getTip() {
// // return this.tip;
// // }

// // void setColor(String newColor) {
// // color = newColor;
// // }

// // void setTip(int newTip) {
// // tip = newTip;

// // }

// // }

// // class BankAccount {
// // public String username;
// // private String password;

// // public void setPassword(String pwd) {
// // password = pwd;
// // }

// // }

// // class Student {
// // String name;
// // int age;
// // float percentage; // cgpa

// // void calcPercentage(int phy, int chem, int math) {
// // percentage = (phy + chem + math) / 3;

// // }
// // }