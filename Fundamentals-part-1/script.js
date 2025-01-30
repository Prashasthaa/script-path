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

//CHALLENGE-2
const massMark = 78;
const heightMark = 1.69;
const massJohn = 92;
const heightJohn = 1.95;

//BMI = mass / height ** 2 = mass / (height * height). (mass in kg and height in meter).
const BMIMark = massMark / heightMark ** 2;
const BMIJohn = massJohn / heightJohn ** 2;

console.log(BMIMark, BMIJohn);
if (BMIMark > BMIJohn) {
  console.log(`Mark's  BMI (${BMIMark}) is higher than John (${BMIJohn})`);
} else {
  console.log(`John's  BMI (${BMIJohn}) is higher than Mark (${BMIMark})`);
}
//Type conversion  coercion
const inputYear = "1991";
console.log(inputYear + 18); //199118
console.log(Number(inputYear) + 18); //2009

console.log(Number("Prash")); //NaN ->not a number
console.log(String(23));

//Type coercion
console.log("I am " + 23 + " Years old");
console.log("23" - 10 - "3"); //10
console.log("23" * 2); //46
console.log("20" / 2); //10

falsy & truly
6 flasy values are false,null,'',0,undefined,NaN;
console.log(Boolean(0)); //false
console.log(Boolean(undefined)); //false
console.log(Boolean(NaN)); //false
console.log(Boolean(null)); //false
console.log(Boolean("Pras")); //true

//Equality operator
//=== strict ,== lose-> type coercion
const age = 18;
if (age === 18) console.log("You Just became an adult (strict)");
if (age == "18") console.log("You Just became an adult (loose)");

//Boolean logic AND , OR, NOT
const hasDriverLicense = true;
const hasgoodVision = false;

console.log(hasDriverLicense && hasgoodVision); //false
console.log(hasDriverLicense || hasgoodVision); //true
console.log(!hasDriverLicense); //false
console.log(!hasgoodVision); //true

//challenge-3
const scoreDolphins = (96 + 108 + 89) / 3;
const scoreKoalas = (88 + 91 + 110) / 3;
console.log(scoreDolphins, scoreKoalas);

if (scoreDolphins > scoreKoalas && scoreDolphins >= 100)
  console.log("Dolphins win the trophy🏆");
else if (scoreDolphins < scoreKoalas && scoreKoalas >= 100)
  console.log("Koalas win the trophy🏆");
else if (
  scoreDolphins === scoreKoalas &&
  scoreDolphins >= 100 &&
  scoreKoalas >= 100
)
  console.log("Both win the trophy🏆");
else console.log("No one wins trophy 😒");


