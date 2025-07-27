import React from 'react';
import CohortDetails from './components/CohortDetails';
import cohorts from './data/cohort-data';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h2>Cohort Dashboard</h2>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;