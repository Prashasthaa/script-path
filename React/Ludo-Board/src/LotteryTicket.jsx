import { useState } from "react";
import "./LotteryTicket.css";
import { genTicket } from "./helper";
export default function LotteryTicket() {
  let [ticket, setTicket] = useState(genTicket(3));
  let generateNum = () => {
    setTicket(genTicket(3));
  };

  return (
    <div>
      <h1>Lottery</h1>
      <h2>
        {" "}
        {ticket[0] + ticket[1] + ticket[2] == 15 ? "Congratulations 🎉" : ""}
      </h2>
      <div className="ticket">
        <span>{ticket[0]}</span>
        <span>{ticket[1]}</span>
        <span>{ticket[2]}</span>
      </div>
      <br />
      <button onClick={generateNum}>Generate new number</button>
    </div>
  );
}
