import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import LudoBoard from "./LudoBoard";
import TodoList from "./TodoList";
import LotteryTicket from "./LotteryTicket";
import TicketNum from "./TicketNum";
import Ticket from "./Ticket";
import { sum } from "./helper";

function App() {
  let winCondition = (ticket) => {
    return ticket[0] === 0;
  };
  return (
    <>
      <LotteryTicket n={3} winCondition={winCondition} />
    </>
  );
}

export default App;
