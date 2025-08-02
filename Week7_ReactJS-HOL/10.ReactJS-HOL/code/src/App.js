import React from 'react';
import './App.css';

function App() {
  const officeSpaces = [
    {
      id: 1,
      name: "Downtown Hub",
      rent: 55000,
      address: "123 Main Street",
image: "/images/downtown hub.jpeg"
    },
    {
      id: 2,
      name: "City View Workspace",
      rent: 72000,
      address: "456 Highrise Ave",
image: "/images/city view.jpeg"
    },
    
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>🏢 Office Space Rental Listings</h1>
      {officeSpaces.map((office) => (
        <div key={office.id} style={{ marginBottom: "20px", border: "1px solid #ccc", padding: "15px" }}>
          <h2>{office.name}</h2>
          <img src={office.image} alt={office.name} style={{ width: "300px", height: "200px" }} />
          <p><strong>Address:</strong> {office.address}</p>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
              ₹{office.rent}
            </span>
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;