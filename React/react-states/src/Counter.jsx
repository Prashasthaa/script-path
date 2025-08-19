import { useState } from "react";

function init() {
  console.log("init was called");

  return Math.random();
}

export default function Counter() {
  let [count, setCount] = useState(init); //initialization
  console.log("component was re-renderd");

  // console.log("Component is rendered");
  // console.log(`count=${count}`);

  let inCount = () => {
    setCount((currCount) => {
      return currCount + 1;
    });
    // setCount((currCount) => {
    //   return currCount + 1;
    // });

    //setCount(25);
    // console.log(`inside inCount, count=${count}`);
  };

  // function inCount() {
  //   setCount(count + 1);
  //   console.log(count);
  // }
  return (
    <div>
      <h3>Count={count}</h3>
      <button onClick={inCount}>Increase Count</button>
    </div>
  );
}
