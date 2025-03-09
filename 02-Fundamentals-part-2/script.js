// //activating strict mode
// "use strict";

// let hasDriversLicense = false;
// const passTest = true;

// if (passTest) hasDriversLicense = true;
// if (hasDriversLicense) console.log("I can drive :)");

// //const interface = "Audio";//resserved keyword

// //functions
// function logger() {
//   console.log(" My name is Prashastha");
// }

// //calling/ running / invoking the function
// logger();
// logger();

// function fruitProcessor(apples, oranges) {
//   console.log(apples, oranges);
//   const juice = `Juice with ${apples} apples and ${oranges} oranges`;
//   return juice;
// }

// const appleJucie = fruitProcessor(5, 0);
// console.log(appleJucie);

// //function declaration
// function calcAge1(birthYear) {
//   return 2037 - birthYear;
// }

// const age1 = calcAge1(2003);
// console.log(age1);

// //function expression
// let calcAge2 = function (birthYear) {
//   return 2037 - birthYear;
// };
// const age2 = calcAge2(2003);
// console.log(age1, age2);

// //arrow function
// const calcAge3 = (birthYear) => 2037 - birthYear;
// const age3 = calcAge3(2003);
// console.log(age1, age2, age3);

// function cutFruitPieces(fruit) {
//   return fruit * 4;
// }

// function fruitProcessor(apples, oranges) {
//   const applePieces = cutFruitPieces(apples);
//   const orangePieces = cutFruitPieces(oranges);
//   const juice = `Juice with ${applePieces} pieces of apples and ${orangePieces} pieces of oranges`;
//   return juice;
// }

// console.log(fruitProcessor(2, 3));

// //challenge-1
// const calcAverage = (a, b, c) => (a + b + c) / 3;
// console.log(calcAverage(3, 4, 5));

// //test 1
// let scoreDolphins = calcAverage(44, 23, 71);
// let scoreKoalas = calcAverage(65, 54, 49);
// console.log(scoreDolphins, scoreKoalas);

// const checkWinner = function (avgDolphins, avgKoalas) {
//   if (avgDolphins >= 2 * avgKoalas) {
//     console.log(`Dolphins win 🏆 (${avgDolphins} vs ${avgKoalas})`);
//   } else if (avgKoalas >= 2 * avgDolphins) {
//     console.log(`Koalas win 🏆 ( ${avgKoalas} vs ${avgDolphins})`);
//   } else {
//     console.log("No team wins ...");
//   }
// };
// checkWinner(scoreDolphins, scoreKoalas);

// //test 2
// scoreDolphins = calcAverage(85, 54, 41);
// scoreKoalas = calcAverage(23, 34, 27);
// checkWinner(scoreDolphins, scoreKoalas);

// //arrays
// const fiend1 = "Michael";
// const friend2 = "Steven";
// const friend3 = "Peter";

// const friends = ["Michael", "Steven", "Peter"];
// console.log(friends);
// console.log(friends[0]);
// console.log(friends.length);
// console.log(friends[0].length);

// friends[2] = "Jay";
// console.log(friends);

// const prash = ["Prashastha", "Poojary", 2037 - 2005, "Student", friends];
// console.log(prash);

// //Excise
// function calcAge(birthYear) {
//   return 2037 - birthYear;
// }
// const years = [1990, 1967, 2002, 2010, 2018];

// //array operations
// //add elemnts
// const friends = ["Michael", "Steven", "Peter"];
// const newLength = friends.push("Jay");
// console.log(friends);
// console.log(newLength);

// friends.unshift("Jay");
// console.log(friends);

// //delete elemnts
// friends.pop(); //last
// console.log(friends);

// friends.shift(); //First
// console.log(friends);

// console.log(friends.indexOf("Steven"));

// console.log(friends.includes("Bob"));

// //challenge-3
// const calcTip = function (bill) {
//   return bill >= 50 && bill <= 300 ? bill * 0.15 : bill * 0.2;
// };

// const bills = [125, 555, 44];
// const tips = [calcTip(bills[0]), calcTip(bills[1]), calcTip(bills[2])];
// const totals = [bills[0] * tips[0], bills[1] * tips[1], bills[2] * tips[2]];

// console.log(bills, tips, totals);

// //objects
// const jonas = {
//   firstName: "Jonas",
//   lastName: "Schmedtmann",
//   age: 2037 - 1991,
//   job: "teacher",
//   friends: ["Micheal", "Peter", "Steven"],
// };
// console.log(jonas.lastName);
// console.log(jonas["lastName"]);

// jonas.location = "Portugal";
// jonas["twitter"] = "@jonasschment";
// console.log(jonas);

// //challenge
// ////Jonas has 3 friends and his best friend is called Michael
// console.log(
//   `${jonas.firstName} as ${jonas.friends.length} friends, and his best freind is ${jonas.friends[0]}`
// );

// const jonas = {
//   firstName: "Jonas",
//   lastName: "Schmedtmann",
//   birthYear: 1991,
//   job: "teacher",
//   friends: ["Micheal", "Peter", "Steven"],
//   hasDriverLicense: true,
//   //method
//   // calcAge: function (birthyear) {
//   //   return 2037 - birthyear;
//   // },
//   calcAge: function () {
//     return 2037 - this.birthYear;
//   },
// };

// console.log(jonas.calcAge());

// //challenge-3
// const mark = {
//   fullName: "Mark Miller",
//   mass: 78,
//   height: 1.69,
//   calcBMI: function () {
//     this.bmi = this.mass / this.height ** 2;
//     return this.bmi;
//   },
// };
// const john = {
//   fullName: "John Smith",
//   mass: 92,
//   height: 1.95,
//   calcBMI: function () {
//     this.bmi = this.mass / this.height ** 2;
//     return this.bmi;
//   },
// };

// mark.calcBMI();
// john.calcBMI();
// console.log(mark.bmi);
// console.log(john.bmi);

// if (mark.bmi > john.bmi) {
//   console.log(
//     `${mark.fullName}'s BMI(${mark.bmi}) is higher than ${john.fullName}'s BMI(${john.bmi})`
//   );
// } else if (mark.bmi < john.bmi) {
//   console.log(
//     `${mark.fullName}'s BMI(${mark.bmi}) is lesser than ${john.fullName}'s BMI(${john.bmi})`
//   );
// }

// //loops
// for (let i = 1; i <= 10; i++) {
//   console.log(`Lifting weights repetition ${i} 🏋️`);
// }

// const jonas = [
//   "Jonas",
//   "Schmedtmann",
//   2037 - 1991,
//   "teacher",
//   ["Micheal", "Peter", "Steven"],
// ];
// // for (let i = 0; i <= jonas.length - 1; i++) {
// //   console.log(jonas[i]);
// // }

// //continue
// console.log("--Only strings---");
// for (let i = 0; i <= jonas.length - 1; i++) {
//   if (typeof jonas[i] !== "string") continue;

//   console.log(jonas[i], typeof jonas[i]);
// }

// //break
// console.log("--BREAK---");
// for (let i = 0; i <= jonas.length - 1; i++) {
//   if (typeof jonas[i] === "number") break;

//   console.log(jonas[i], typeof jonas[i]);
// }

// //loops in loop
// for (let exercise = 1; exercise < 4; exercise++) {
//   console.log(`----Starting Exercise ${exercise}-----`);
//   for (let i = 1; i <= 5; i++) {
//     console.log(`Lifting weights repetition ${i} 🏋️`);
//   }
// }

// //while loop
// let rep = 1;
// while (rep <= 10) {
//   console.log(`Lifting weights repetition ${rep} 🏋️`);
//   rep++;
// }

// ////challenge-4
// const calcTip = function (bill) {
//   return bill >= 50 && bill <= 300 ? bill * 0.15 : bill * 0.2;
// };
// const bills = [22, 295, 176, 440, 37, 105, 10, 1100, 86, 52];
// const tips = [];
// const totals = [];
// for (let i = 0; i < bills.length; i++) {
//   const tip = calcTip(bills[i]);
//   tips.push(tip);
//   totals.push(tip + bills[i]);
// }
// console.log(bills, tips, totals);

// const calcAverage = function (arr) {
//   let sum = 0;
//   for (let i = 0; i < arr.length; i++) {
//     //sum = sum + arr[i];
//     sum += arr[i];
//   }

//   return sum / arr.length;
// };

// console.log(calcAverage(totals));

// //activating strict mode
"use strict";

// let hasDriverLicense = false;
// const passTest = true;

// if (passTest) hasDriverLicense = true;

// if (hasDriverLicense) console.log("I can drive");

// // const interface = "Audio";
// //const private = "Audio";

// function logger(name) {
//   console.log("My name is Jonas");
// }

// //calling /running /invoking function
// logger();
// logger();

// function fruitProcessor(apples, oranges) {
//   console.log(apples, oranges);
//   const jucice = `Juice with ${apples} apples and ${oranges} oranges`;
//   return jucice;
// }
// const appleJucice = fruitProcessor(9, 0);
// console.log(appleJucice);
// const orangeJucice = fruitProcessor(0, 10);
// console.log(orangeJucice);

// const appleOrangeJucie = fruitProcessor(2, 3);
// console.log(appleOrangeJucie);

// //function declaration
// function calcAge(birthYear) {
//   const age = 2037 - birthYear;
//   return age;
// }
// console.log(calcAge(1998));

// //function expression
// const calcAge2 = function (birthYear) {
//  return 2037 - birthYear;
//   return age;
// };
// console.log(calcAge2(1998));

// //function expression
// const calcAge2 = function (birthYear) {
//   return 2037 - birthYear;
// };

// //Arrow function
// const calcAge = (birthYear) => 2037 - birthYear;
// const age3 = calcAge(1992);
// console.log(age3);

// ///function calling other function

// function cutFruitPieces(fruit) {
//   return fruit * 4;
// }

// function fruitProcessor(apples, oranges) {
//   const applePieces = cutFruitPieces(apples);
//   const orangePieces = cutFruitPieces(oranges);
//   const jucice = `Juice with ${applePieces} apples pices and ${orangePieces} oranges pieces`;
//   return jucice;
// }
// console.log(fruitProcessor(2, 3));

// const friend1 = "Micheal";
// const friend2 = "Steven";
// const friend3 = "Peter";

// const friend = ["Micheal", "Steven", "Peter"];
// console.log(friend);

// const years = new Array(1991, 1997, 2008, 2020);
// console.log(years);

// console.log(friend[0]);
// console.log(friend[1], friend[2]);
// console.log(friend.length);
// console.log(friend[friend.length - 1]);

// const friend = ["Micheal", "Steven", "Peter"];
// friend.push("Jay");
// console.log(friend);

// friend.unshift("John");
// console.log(friend);

// friend.pop();
// console.log(friend);

// friend.shift();
// console.log(friend);

// console.log(friend.indexOf("Steven"));
// console.log(friend.indexOf("bob"));

// console.log(friend.includes("Steven"));
// console.log(friend.includes("bob"));

// const jonas = {
//   firstName: "Jonas",
//   lastName: "Pojary",
//   age: 2037 - 1996,
//   job: "Teacher",
//   friends: ["Micheal", "Steven", "Peter"],
// };

const jonas = {
  firstName: "Jonas",
  lastName: "Pojary",
  age: 2037 - 1996,
  job: "Teacher",
  friends: ["Micheal", "Steven", "Peter"],
};
console.log(jonas);

console.log(jonas.lastName);
console.log(jonas["lastName"]);

//challenge
console.log(
  `${jonas.firstName} has ${jonas.friends.length} friends , and his bestfriend is ${jonas.friends[0]}`
);
