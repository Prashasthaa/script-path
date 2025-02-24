'use strict';

const Person = function (firstName, birthYear) {
  //Instance Properties
  this.firstName = firstName;
  this.birthYear = birthYear;

  //   //Never do this
  //   this.calcAge = function () {
  //     console.log(2037 - birthYear);
  //   };
};

let jonas = new Person('Jonas', 1991);
console.log(jonas);

//1.New {} empty object is created
//2. function is called  ,this={}
//3.{} linked to prototype
//4.function automatically return{}

const matilda = new Person('Matlda', 1990);
const jack = new Person('Jack', 2005);

console.log(matilda, jack);

const jay = 'Jay';

console.log(jonas instanceof Person);
console.log(jay instanceof Person);

//Prototypes
console.log(Person.prototype);

Person.prototype.calcAge = function () {
  console.log(2037 - this.birthYear);
};

jonas.calcAge();
matilda.calcAge();
jack.calcAge();

console.log(jonas.__proto__);
console.log(jonas.__proto__ === Person.prototype);

console.log(Person.prototype.isPrototypeOf(jonas));
console.log(Person.prototype.isPrototypeOf(Person));

//.prtotypeOfLinkedObjects

Person.prototype.species = 'Homo Sapiens';
console.log(jonas.species, matilda.species);

console.log(jonas.hasOwnProperty('firstName'));
console.log(jonas.hasOwnProperty('species'));
