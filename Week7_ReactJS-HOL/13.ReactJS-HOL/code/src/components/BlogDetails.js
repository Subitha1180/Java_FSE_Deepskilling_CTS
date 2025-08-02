import React from "react";

const blogs = [
  {
    title: "React Learning",
    author: "Stephen Biz",
    desc: "Welcome to learning React!",
  },
  {
    title: "Installation",
    author: "Schewzdenier",
    desc: "You can install React from npm.",
  },
];

const BlogDetails = () => {
  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.map((blog, idx) => (
        <div key={idx}>
          <strong>{blog.title}</strong>
          <div><em>{blog.author}</em></div>
          <p>{blog.desc}</p>
        </div>
      ))}
    </div>
  );
};

export default BlogDetails;