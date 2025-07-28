function doSomething() {
  console.log("Button was Clicked");
}
function doSomethingWhenparClicked() {
  console.log("Paragraph was Clicked");
}
function handleHover() {
  console.log("hover ");
}
function printBye() {
  {
    console.log("bye");
  }
}

export default function Button() {
  return (
    <div>
      <button onClick={doSomething}>Click Me!</button>
      <p onClick={doSomethingWhenparClicked}>Check out</p>
      <button onMouseOver={handleHover}>Hover over me!!</button>
      <p onMouseOver={printBye}>
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat, minus
        aliquid iure velit assumenda perspiciatis sapiente rerum fugit, est
        maxime et autem debitis optio, soluta repellendus? Eum quisquam
        excepturi nesciunt!
      </p>
    </div>
  );
}
