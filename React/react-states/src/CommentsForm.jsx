import { useState } from "react";
import { useFormik } from "formik";

// which keys are symmetrical to our values/initialValues
const validate = (values) => {
  const errors = {};
  if (!values.username) {
    errors.username = "user name is required !";
  }
  if (!values.remarks) {
    errors.remarks = "remarks is required !";
  }
  if (!values.rating) {
    errors.rating = "rating is required !";
  }

  return errors;
};

export default function CommentsForm({ addNewComment }) {
  // let [formData, setFormData] = useState({
  //   username: "",
  //   remarks: "",
  //   rating: 5,
  // });

  // let [isValid, SetIsValid] = useState(true);

  const formik = useFormik({
    initialValues: {
      username: "",
      remarks: "",
      rating: 5,
    },
    validate,
    onSubmit: (values) => {
      alert(JSON.stringify(values, null, 2));
    },
  });

  // let handleInputChange = (event) => {
  //   setFormData((currData) => {
  //     return { ...currData, [event.target.name]: event.target.value };
  //   });
  // };

  // let handleSubmit = (event) => {
  //   // if (!formData.username) {
  //   //   console.log("username is null");
  //   //   SetIsValid(false);
  //   //   event.preventDefault();
  //   //   return;
  //   // }

  //   console.log(formData);
  //   addNewComment(formData);
  //   event.preventDefault();
  //   setFormData({
  //     username: "",
  //     remarks: "",
  //     rating: 5,
  //   });
  // };

  return (
    <div>
      <h4>Give a Comment </h4>
      <form onSubmit={formik.handleSubmit}>
        <label htmlFor="username">UserName</label>
        <input
          id="username"
          placeholder="username"
          type="text"
          value={formik.values.username}
          onChange={formik.handleChange}
          name="username"
        />
        {formik.errors.username ? <div>{formik.errors.username}</div> : null}
        {/* {!isValid && <p style={{ color: "red" }}>Username cn't be empty</p>} */}
        <br />
        <br />
        <label htmlFor="remark">Remarks</label>
        <textarea
          id="remark"
          value={formik.values.remarks}
          placeholder="add few remarks"
          onChange={formik.handleChange}
          name="remarks"
        ></textarea>
        {formik.errors.remarks ? <div>{formik.errors.remarks}</div> : null}
        <br />
        <br />

        <label htmlFor="rating">Rating</label>
        <input
          id="rating"
          placeholder="rating"
          type="number"
          min={1}
          max={5}
          value={formik.values.rating}
          onChange={formik.handleChange}
          name="rating"
        />
        {formik.errors.rating ? <div>{formik.errors.rating}</div> : null}
        <br />
        <br />
        <button type="submit">Add Comment</button>
      </form>
    </div>
  );
}
