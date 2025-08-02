import React, { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  let page;
  if (isLoggedIn) {
    page = <UserPage />;
  } else {
    page = <GuestPage />;
  }

  return (
    <div style={{ padding: "20px" }}>
      <h1>Flight Ticket Booking App</h1>
      <button onClick={isLoggedIn ? handleLogout : handleLogin}>
        {isLoggedIn ? "Logout" : "Login"}
      </button>
      <hr />
      {page}
    </div>
  );
}

export default App;