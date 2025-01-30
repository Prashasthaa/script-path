//activating strict mode
"use strict";

let hasDriversLicense = false;
const passTest = true;

if (passTest) hasDriversLicense = true;
if (hasDriversLicense) console.log("I can drive :)");

//const interface = "Audio";//resserved keyword

//functions
function logger() {
  console.log(" My name is Prashastha");
}

//calling/ running / invoking the function
logger();
logger();

function fruitProcessor(apples, oranges) {
  console.log(apples, oranges);
  const juice = `Juice with ${apples} apples and ${oranges} oranges`;
  return juice;
}

const appleJucie = fruitProcessor(5, 0);
console.log(appleJucie);

//function declaration
function calcAge1(birthYear) {
  return 2037 - birthYear;
}

const age1 = calcAge1(2003);
console.log(age1);

//function expression
let calcAge2 = function (birthYear) {
  return 2037 - birthYear;
};
const age2 = calcAge2(2003);
console.log(age1, age2);

//arrow function
const calcAge3 = (birthYear) => 2037 - birthYear;
const age3 = calcAge3(2003);
console.log(age1, age2, age3);
