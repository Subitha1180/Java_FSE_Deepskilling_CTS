import React from "react";

const courses = [
  { name: "Angular", date: "4/5/2021" },
  { name: "React", date: "6/3/20201" },
];

const CourseDetails = () => {
  return (
    <div>
      <h2>Course Details</h2>
      {courses.map((course, idx) => (
        <div key={idx}>
          <strong>{course.name}</strong>
          <div>{course.date}</div>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;