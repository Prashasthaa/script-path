import { useState } from "react";

export default function Form() {
  // let [fullName, setFullName] = useState("");
  // let [userName, setUserName] = useState("");

  let [formData, setFormData] = useState({
    fullName: "",
    userName: "",
    password: "",
  });

  // let handleNameChange = (event) => {
  //   setFullName(event.target.value);
  // };
  // let handleUserName = (event) => {
  //   setUserName(event.target.value);
  // };

  let handleInputChange = (event) => {
    // let fieldName = event.target.name;
    // let newValue = event.target.value;

    // console.log(fileName);
    // console.log(newValue);

    setFormData((currData) => {
      // currData[fieldName] = newValue;
      // return { ...currData };

      //OR

      // return { ...currData, [filedName]: newValue };

      return { ...currData, [event.target.name]: event.target.value };
    });
  };

  let handleSubmit = (event) => {
    event.preventDefault();
    console.log(formData);

    setFormData({
      fullName: "",
      userName: "",
      password: "",
    });
  };

  return (
    <form onSubmit={handleSubmit}>
      <label htmlFor="fullName">Full Name</label>
      <input
        placeholder="enter your full name"
        type="text"
        value={formData.fullName}
        // onChange={handleNameChange}
        onChange={handleInputChange}
        id="fullName"
        name="fullName"
      />
      <br></br>
      <br></br>
      <label htmlFor="userName">User Name</label>
      <input
        placeholder="enter your user name"
        type="text"
        value={formData.userName}
        // onChange={handleUserName}
        onChange={handleInputChange}
        id="userName"
        name="userName"
      />
      <br></br>
      <br></br>
      <label htmlFor="password">Password</label>
      <input
        placeholder="enter your password"
        type="text"
        value={formData.password}
        onChange={handleInputChange}
        id="password"
        name="password"
      />
      <br></br>
      <br></br>
      <button>Submit</button>
    </form>
  );
}
