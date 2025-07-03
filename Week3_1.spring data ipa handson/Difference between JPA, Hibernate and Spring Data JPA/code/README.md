
# Spring Data JPA Hands-on

This project demonstrates the difference and practical usage of **JPA**, **Hibernate**, and **Spring Data JPA**.

---

## 🔍 What’s Included

### 1. JPA (Java Persistence API)
- Used as an **API specification** for ORM.
- Demonstrated via annotations like `@Entity`, `@Id`, `@GeneratedValue` in `Student.java`.

### 2. Hibernate
- Hibernate is the **JPA provider** used by Spring Boot under the hood.
- Automatically handles SQL generation, caching, lazy loading, etc.

### 3. Spring Data JPA
- Simplifies data access using Spring Repository interfaces.
- `StudentRepository` extends `JpaRepository` to provide CRUD and custom query methods.

---

## 📁 Project Structure

```
spring-data-jpa-handson/
├── pom.xml
├── README.md
├── src/
│   └── main/
│       ├── java/
│       │   ├── Application.java
│       │   ├── Student.java
│       │   ├── StudentController.java
│       │   └── StudentRepository.java
│       └── resources/
│           └── application.properties
```

---

## ▶️ How to Run

1. Make sure you have Java 17+ and Maven installed.
2. Run the project:
   ```bash
   mvn spring-boot:run
   ```
3. Access the H2 console at: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
4. Test the API with tools like Postman or curl.

---

## 🔗 Sample Endpoints

- `POST /students` - Add a student
- `GET /students` - Get all students
- `GET /students/{name}` - Find student by name

---

### 💡 Technologies Used
- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 In-memory Database
