import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  return (
    <Router>
      <div>
        <h1>Welcome to Cricket App</h1>
        <nav>
          <ul>
            <li><Link to="/players">List of Players</Link></li>
            <li><Link to="/indians">Indian Players</Link></li>
          </ul>
        </nav>

        <Routes>
          <Route path="/players" element={<ListofPlayers />} />
          <Route path="/indians" element={<IndianPlayers />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
