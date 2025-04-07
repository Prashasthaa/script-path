"use strict";

function calcAge(birthYear) {
  const age = 2037 - birthYear;
  function printAge() {
    let output = `${firstName}, You are ${age}, born in ${birthYear}`;
    console.log(output);

    if (birthYear >= 1981 && birthYear <= 1996) {
      var millenial = true;

      //Creating New variable with same name as outer scope's variable
      const firstName = "Steven";

      //reassainging outer scope's variable
      output = "New output";
      const str = `oh, and your a millenial, ${firstName}`;
      console.log(str);
      function add(a, b) {
        return a + b;
      }
    }
    //console.log(str);//error
    console.log(millenial);
    //add(2, 3); //eror
  }
  printAge();
  return age;
}
const firstName = "Jonas";
calcAge(1991);
//console.log(age);//refrence error
//printAge();//error

//part-2
//Varibles
console.log(me);
//console.log(job);//Cannot access 'job' before initialization
//console.log(year);//Cannot access 'year' before initialization

var me = "Jonas";
let job = "teacher";
const year = 1991;

//functions
console.log(addDecl(2, 3));
//console.log(addExpr(2, 3));//Cannot access 'addExpr' before initialization
//console.log(addArrow(2, 3)); //ReferenceError: Cannot access 'addArrow' before initialization
function addDecl(a, b) {
  return a + b;
}
const addExpr = function (a, b) {
  return a + b;
};

const addArrow = (a, b) => a + b;

//Example
if (!numProducts) deleteShoppingCart();

var numProducts = 10;

function deleteShoppingCart() {
  console.log("All products deleted");
}

var x = 1;
let y = 2;
const z = 3;

console.log(x === window.x);
console.log(y === window.y);
console.log(z === window.z);

console.log(this);
const calcAge = function (birthYear) {
  console.log(2037 - birthYear);
  console.log(this);
};
calcAge(1991);

const calcAgeArrow = (birthYear) => {
  console.log(2037 - birthYear);
  console.log(this);
};
calcAgeArrow(1990);

const jonas = {
  year: 1991,
  calcAge: function () {
    console.log(2037 - this.year);
  },
};
jonas.calcAge();

const matilda = {
  year: 2017,
};
matilda.calcAge = jonas.calcAge;
matilda.calcAge();

const f = jonas.calcAge;
//f();//Cannot read properties of undefined (reading 'year')at calcAge

var firstName = "Matilda";
const jonas = {
  firstName: "Jonas",
  year: 1991,
  calcAge: function () {
    console.log(2037 - this.year);
    //solution-1
    // const self = this; //self or that
    // const isMillenial = function () {
    //   console.log(self.year >= 1981 && self.year <= 1996);
    // };

    //solution-2
    const isMillenial = () => {
      console.log(this);

      console.log(this.year >= 1981 && this.year <= 1996);
    };
    isMillenial();
  },
  greet: () => console.log(`Hey ${this.firstName}`), //Hey Matilda
};

jonas.greet();
jonas.calcAge();

//arguments keyword
// const addExpr = function (a, b) {
//   console.log(arguments);
//   return a + b;
// };

addExpr(2, 3);
addExpr(2, 6, 7, 3);

const addArrow = (a, b) => {
  //console.log(arguments); //arguments is not defined

  return a + b;
};
addArrow(2, 3);

let age = 30;
let oldAge = age;
age = 31;
console.log(age);
console.log(oldAge);

const me = {
  name: "Jonas",
  age: 30,
};
const friend = me;
friend.age = 27;
console.log("Friend:", friend); //{name: 'Jonas', age: 27}
console.log("Me:", me); //{name: 'Jonas', age: 27}

//primitive types
let lastName = "Willams";
let oldLastName = lastName;
lastName = "Davis";
console.log(lastName, oldLastName);

//Refrence types
const jessica = {
  firstName: "Jessica",
  lastName: "Willams",
  age: 27,
};
const marriedJassica = jessica;
marriedJassica.lastName = "Davis";
console.log("Before marriage:", jessica);
console.log("After Marriage:", marriedJassica);

//copying objects
const jessica2 = {
  firstName: "Jessica",
  lastName: "Willams",
  age: 27,
  family: ["Alice", "Bob"],
};

const jessicaCopy = Object.assign({}, jessica2);
jessicaCopy.lastName = "davis";
console.log("Before marriage:", jessica2);
console.log("After Marriage:", jessicaCopy);

jessicaCopy.family.push("Marry");
jessicaCopy.family.push("John");
console.log("Before marriage:", jessica2);
console.log("After Marriage:", jessicaCopy);
