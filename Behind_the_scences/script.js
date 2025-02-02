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
