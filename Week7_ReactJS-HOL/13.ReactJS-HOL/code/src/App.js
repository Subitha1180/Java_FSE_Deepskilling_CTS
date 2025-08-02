import React from "react";
import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import "./App.css";

function App() {
  return (
    <div className="container">
      <CourseDetails />
      <div className="divider" />
      <BookDetails />
      <div className="divider" />
      <BlogDetails />
    </div>
  );
}

export default App;