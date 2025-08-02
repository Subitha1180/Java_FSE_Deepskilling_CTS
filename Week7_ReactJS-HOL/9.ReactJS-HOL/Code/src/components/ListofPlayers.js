import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 88 },
    { name: "Dhoni", score: 68 },
    { name: "Kohli", score: 45 },
    { name: "Rahul", score: 72 },
    { name: "Pant", score: 60 },
    { name: "Ashwin", score: 77 },
    { name: "Jadeja", score: 51 },
    { name: "Bumrah", score: 84 },
    { name: "Shami", score: 66 },
    { name: "Iyer", score: 93 }
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players:</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with score below 70 :</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;