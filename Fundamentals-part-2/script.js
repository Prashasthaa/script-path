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

function cutFruitPieces(fruit) {
  return fruit * 4;
}

function fruitProcessor(apples, oranges) {
  const applePieces = cutFruitPieces(apples);
  const orangePieces = cutFruitPieces(oranges);
  const juice = `Juice with ${applePieces} pieces of apples and ${orangePieces} pieces of oranges`;
  return juice;
}

console.log(fruitProcessor(2, 3));

//challenge-1
const calcAverage = (a, b, c) => (a + b + c) / 3;
console.log(calcAverage(3, 4, 5));

//test 1
let scoreDolphins = calcAverage(44, 23, 71);
let scoreKoalas = calcAverage(65, 54, 49);
console.log(scoreDolphins, scoreKoalas);

const checkWinner = function (avgDolphins, avgKoalas) {
  if (avgDolphins >= 2 * avgKoalas) {
    console.log(`Dolphins win 🏆 (${avgDolphins} vs ${avgKoalas})`);
  } else if (avgKoalas >= 2 * avgDolphins) {
    console.log(`Koalas win 🏆 ( ${avgKoalas} vs ${avgDolphins})`);
  } else {
    console.log("No team wins ...");
  }
};
checkWinner(scoreDolphins, scoreKoalas);

//test 2
scoreDolphins = calcAverage(85, 54, 41);
scoreKoalas = calcAverage(23, 34, 27);
checkWinner(scoreDolphins, scoreKoalas);
