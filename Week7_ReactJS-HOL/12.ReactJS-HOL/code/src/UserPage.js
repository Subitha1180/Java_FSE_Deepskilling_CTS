import React from 'react';

const UserPage = () => {
  return (
    <div>
      <h2>Welcome Back, User!</h2>
      <p>Book your flight below:</p>
      <form>
        <label>
          Select Flight:
          <select>
            <option>Flight A - New York to London</option>
            <option>Flight B - Paris to Tokyo</option>
            <option>Flight C - Sydney to Dubai</option>
          </select>
        </label>
        <br /><br />
        <button type="submit">Book Ticket</button>
      </form>
    </div>
  );
};

export default UserPage;