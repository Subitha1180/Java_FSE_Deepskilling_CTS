CREATE DATABASE IF NOT EXISTS bankdb;
USE bankdb;

DROP TABLE IF EXISTS loans;
DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    balance DECIMAL(10,2),
    is_vip CHAR(1),
    interest_rate DECIMAL(4,2)
);

CREATE TABLE loans (
    loan_id INT PRIMARY KEY,
    customer_id INT,
    due_date DATE,
    interest_rate DECIMAL(4,2),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

INSERT INTO customers VALUES 
(1, 'Alice', 65, 15000.00, 'N', 8.5),
(2, 'Bob', 45, 9000.00, 'N', 7.0),
(3, 'Charlie', 70, 11000.00, 'N', 6.5),
(4, 'David', 50, 13000.00, 'N', 7.5);

INSERT INTO loans VALUES 
(101, 1, '2025-12-15', 8.5),
(102, 2, '2025-11-01', 7.0),
(103, 3, '2025-09-20', 6.5),
(104, 1, '2025-08-10', 8.5),
(105, 4, '2025-10-25', 7.5);

DROP TEMPORARY TABLE IF EXISTS vip_ids;

CREATE TEMPORARY TABLE vip_ids AS
SELECT customer_id FROM customers
WHERE balance > 12000 OR age > 60;

UPDATE customers 
JOIN vip_ids ON customers.customer_id = vip_ids.customer_id
SET customers.is_vip = 'Y';

SELECT * FROM customers;

SELECT * FROM loans;

SELECT 
    c.customer_id, 
    c.name, 
    l.loan_id, 
    l.due_date, 
    l.interest_rate 
FROM 
    customers c 
JOIN 
    loans l 
ON 
    c.customer_id = l.customer_id;

SELECT * FROM customers WHERE is_vip = 'Y';
