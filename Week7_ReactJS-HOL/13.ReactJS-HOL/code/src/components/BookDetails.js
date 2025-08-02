import React from "react";

const books = [
  { title: "Master React", price: 670 },
  { title: "Deep Dive into Angular 11", price: 800 },
  { title: "Mongo Essentials", price: 450 },
];

const BookDetails = () => {
  return (
    <div>
      <h2>Book Details</h2>
      {books.map((book, idx) => (
        <div key={idx}>
          <strong>{book.title}</strong>
          <div>{book.price}</div>
        </div>
      ))}
    </div>
  );
};

export default BookDetails;