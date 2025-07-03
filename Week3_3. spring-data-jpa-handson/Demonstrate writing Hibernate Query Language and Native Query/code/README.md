# spring-data-jpa-handson

This project demonstrates:
1. Difference between JPA, Hibernate, and Spring Data JPA
2. Find a country by country code
3. Add a new country
4. Query methods in Spring Data JPA
5. Object-Relational Mapping (O/R Mapping)
6. HQL and native SQL queries with Hibernate

## How to Run
```bash
mvn spring-boot:run
```

Visit:
- [http://localhost:8080/countries](http://localhost:8080/countries)
- [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- [http://localhost:8080/countries/code/IN](http://localhost:8080/countries/code/IN)
- [http://localhost:8080/countries/capital/New%20Delhi] (http://localhost:8080/countries/capital/New%20Delhi)
- [http://localhost:8080/countries/search/Ind] (http://localhost:8080/countries/search/Ind)
- [http://localhost:8080/countries/population/1000000000] (http://localhost:8080/countries/population/1000000000)
- [http://localhost:8080/countries/hql/India] (http://localhost:8080/countries/hql/India)
- [http://localhost:8080/countries/native/New%20Delhi] (http://localhost:8080/countries/native/New%20Delhi)