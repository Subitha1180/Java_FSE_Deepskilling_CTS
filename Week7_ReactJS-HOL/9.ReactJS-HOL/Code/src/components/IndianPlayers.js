import React from 'react';

const IndianPlayers = () => {
  const oddPlayers = ["Rohit", "Dhoni", "Rahul", "Ashwin", "Shami"];
  const evenPlayers = ["Virat", "Kohli", "Pant", "Jadeja", "Bumrah"];

  const [p1, p2, p3, p4, p5] = oddPlayers;
  const [q1, q2, q3, q4, q5] = evenPlayers;

  const T20players = ["Gill", "Surya", "Hardik"];
  const RanjiPlayers = ["Pujara", "Vihari", "Saha"];

  const allPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players:</h2>
      <ul>
        <li>{p1}</li>
        <li>{p2}</li>
        <li>{p3}</li>
        <li>{p4}</li>
        <li>{p5}</li>
      </ul>

      <h2>Even Team Players:</h2>
      <ul>
        <li>{q1}</li>
        <li>{q2}</li>
        <li>{q3}</li>
        <li>{q4}</li>
        <li>{q5}</li>
      </ul>

      <h2>Merged T20 and Ranji Trophy Players:</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;