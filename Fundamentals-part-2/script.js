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

//arrays
const fiend1 = "Michael";
const friend2 = "Steven";
const friend3 = "Peter";

const friends = ["Michael", "Steven", "Peter"];
console.log(friends);
console.log(friends[0]);
console.log(friends.length);
console.log(friends[0].length);

friends[2] = "Jay";
console.log(friends);

const prash = ["Prashastha", "Poojary", 2037 - 2005, "Student", friends];
console.log(prash);

//Excise
function calcAge(birthYear) {
  return 2037 - birthYear;
}
const years = [1990, 1967, 2002, 2010, 2018];

array operations
add elemnts
const friends = ["Michael", "Steven", "Peter"];
const newLength = friends.push("Jay");
console.log(friends);
console.log(newLength);

friends.unshift("Jay");
console.log(friends);

//delete elemnts
friends.pop(); //last
console.log(friends);

friends.shift(); //First
console.log(friends);

console.log(friends.indexOf("Steven"));

console.log(friends.includes("Bob"));

//challenge-3
const calcTip = function (bill) {
  return bill >= 50 && bill <= 300 ? bill * 0.15 : bill * 0.2;
};

const bills = [125, 555, 44];
const tips = [calcTip(bills[0]), calcTip(bills[1]), calcTip(bills[2])];
const totals = [bills[0] * tips[0], bills[1] * tips[1], bills[2] * tips[2]];

console.log(bills, tips, totals);
