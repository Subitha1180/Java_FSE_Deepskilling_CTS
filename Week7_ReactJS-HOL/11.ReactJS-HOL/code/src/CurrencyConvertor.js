import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');

  const handleChange = (e) => {
    setRupees(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const value = parseFloat(rupees);
    if (!isNaN(value)) {
      const result = value / 89.5; 
      setEuro(result.toFixed(2));
    } else {
      setEuro("Invalid input");
    }
  };

  return (
    <div>
      <h2>Currency Convertor (INR ➜ Euro)</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Enter INR"
          value={rupees}
          onChange={handleChange}
        />
        <button type="submit">Convert</button>
      </form>
      <p>Converted Euro: {euro}</p>
    </div>
  );
};

export default CurrencyConvertor;
