import { useState } from "react";
import "./Comment.css";
import CommnetsForm from "./CommentsForm";
export default function Comment() {
  let [comments, setComments] = useState([
    {
      username: "@sk",
      remarks: "great job!",
      rating: 4,
    },
  ]);

  let addNewComment = (commnet) => {
    setComments((currComments) => [...currComments, commnet]);
    console.log("added new comment");
  };

  return (
    <>
      {" "}
      <div>
        <h3>All Comments</h3>
        {comments.map((comment, idx) => (
          <div className="comment" key={idx}>
            <span>{comment.remarks}</span>
            &nbsp;
            <span>(rating={comment.rating})</span>
            &nbsp;
            <p>- {comment.username}</p>
          </div>
        ))}
      </div>
      <hr></hr>
      <CommnetsForm addNewComment={addNewComment} />
    </>
  );
}
