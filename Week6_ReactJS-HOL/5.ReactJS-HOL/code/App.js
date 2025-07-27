import React from 'react';
import './App.css';

const cohorts = [
  {
    id: "INTADMDF10 -.NET FSD",
    startDate: "22-Feb-2022",
    status: "Scheduled",
    coach: "Aathma",
    trainer: "Jojo Jose",
    color: "blue"
  },
  {
    id: "ADM21JF014 - Java FSD",
    startDate: "10-Sep-2021",
    status: "Ongoing",
    coach: "Apoorv",
    trainer: "Elisa Smith",
    color: "green"
  },
  {
    id: "CDBJF21025 - Java FSD",
    startDate: "24-Dec-2021",
    status: "Ongoing",
    coach: "Aathma",
    trainer: "John Doe",
    color: "green"
  }
];

function App() {
  return (
    <div className="container">
      <h1 className="title">Cohorts Details</h1>
      <div className="card-container">
        {cohorts.map((cohort, index) => (
          <div className="card" key={index}>
            <h2 style={{ color: cohort.color }}>{cohort.id}</h2>
            <p><strong>Started On</strong><br />{cohort.startDate}</p>
            <p><strong>Current Status</strong><br />{cohort.status}</p>
            <p><strong>Coach</strong><br />{cohort.coach}</p>
            <p><strong>Trainer</strong><br />{cohort.trainer}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;