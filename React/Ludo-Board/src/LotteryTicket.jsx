import { useState } from "react";
import { genTicket, sum } from "./helper";
import Ticket from "./Ticket";
import Button from "./Button";

export default function LotteryTicket({ n = 3, winCondition }) {
  let [ticket, setTicket] = useState(genTicket(n));
  let generateNum = () => {
    setTicket(genTicket(n));
  };
  let isWin = winCondition(ticket);
  return (
    <div>
      <h1>Lottery</h1>

      <Ticket ticket={ticket} />
      <Button action={generateNum} />
      <h2>{isWin && "Congratulations 🎉"}</h2>
    </div>
  );
}
