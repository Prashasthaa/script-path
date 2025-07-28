function handleFormSubmit() {
  event.preventDefault();
  console.log("form was submitted");
}

export default function Form() {
  return (
    <form>
      <input type="text" />
      <button onClick={handleFormSubmit}>Submit</button>
    </form>
  );
}
