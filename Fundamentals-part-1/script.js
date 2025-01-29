let js = "amazing";
console.log(40 + 8 + 23 - 10);

//values
console.log("Prashastha"); //prashastha is a value
console.log(23);

//variables
let firstName = "Prashastha"; //firstName is variable

console.log(firstName);
console.log(firstName);
console.log(firstName);

//variable name convientions
let PI = 3.14157;

let myFirstJob = "Programmer";
let myCurentJob = "Teacher";

let job1 = "Programmer";
let job2 = "Teacher";

console.log(myFirstJob);

//single line comment
/* Multiline comment */

//boolean values
console.log(true);
let javaScriptIsFun = true;
console.log(javaScriptIsFun);

//type off
console.log(typeof true); //boolean
console.log(typeof javaScriptIsFun); //boolean
console.log(typeof 23); //number
console.log(typeof "Hello"); //string

//Dynamic typing
javaScriptIsFun = "yes";
console.log(typeof javaScriptIsFun); //string

//undefined
let year;
console.log(year);
console.log(typeof year); //undefined

//null
console.log(null);

//let
let age = 30;
age = 31;

//c0nstant
const birthYear = 2005;
// birthYear = 2001; //error

//var
var job = "programmer";
job = "teacher";

//operator
//arthematic operator
const now = 2037;
const ageJones = now - 1991;
const ageSarah = now - 2018;
console.log(ageJones, ageSarah);
console.log(ageJones * 2, ageJones / 10, 2 ** 3);
//2**3 => 2*2*2;
//+
const firstName = "Prashastha";
const lastName = "Poojary";
console.log(firstName + " " + lastName);

//assignment operator
let x = 5 + 10; //15
x += 10; //x= x+10=25
x *= 4; //x=x*2=100
x++; //x=x+1=101
x--; //x=x-1=100
console.log(x);

//comparison operators
//>,<.>=,<=

//CHALLENGE-1
const massMark = 78;
const heightMark = 1.69;
const massJohn = 92;
const heightJohn = 1.95;

//BMI = mass / height ** 2 = mass / (height * height). (mass in kg and height in meter).
const BMIMark = massMark / heightMark ** 2;
const BMIJohn = massJohn / heightJohn ** 2;
const markHigherBMI = BMIMark > BMIJohn;
console.log(BMIMark, BMIJohn, markHigherBMI);

//strings & Template literals

const firstName = "Prashastha";
const job = "programmer";
const birtYear = 2005;
const year = 2037;

const prash = `I'm ${firstName}, a ${year - birtYear} year old ${job}`;
console.log(prash);

// /n -> new line

//Decision Taking
const age = 17;
const isOldEnough = age >= 18;

//if-else-statement
if (isOldEnough) {
  console.log("Sarah can start driving license 🚗");
} else {
  const yearsLeft = 18 - age;
  console.log(`Sarah is to young. wait another ${yearsLeft} years :)`);
}


