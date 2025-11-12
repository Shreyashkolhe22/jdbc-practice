# Java JDBC Examples

A collection of beginner-friendly Java programs demonstrating **database connectivity using PostgreSQL**.  
This repository is intended for Java learners who want to practice **JDBC concepts**, including executing SQL queries and handling results.

---

## Features

- Connect to a PostgreSQL database using JDBC
- Execute SQL queries using:
  - `Statement`
  - `PreparedStatement`
- Process query results using `ResultSet`
- Proper resource management (closing connections, statements, and result sets)
- Exception handling in JDBC

---

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Programs](#programs)
- [Usage](#usage)
- [License](#license)

---

## Prerequisites

- Java JDK 8 or higher
- PostgreSQL database installed
- PostgreSQL JDBC driver (included in project libraries or Maven dependency)
- Basic knowledge of SQL

---

## Installation

1. Clone the repository using SSH:

```bash
git clone git@github.com:Shreyashkolhe22/java-jdbc-examples.git
Ensure your PostgreSQL database is running and has the required student table:

sql
Copy code
CREATE TABLE student (
    rollno SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    marks INT
);
Update database connection details in the Java files:

java
Copy code
String url = "jdbc:postgresql://localhost:5432/postgres";
String user = "your_db_username";
String pass = "your_db_password";
Programs
1. Statement Example
File: Jdbc_statement.java

Demonstrates executing a SQL query using a simple Statement.

Retrieves student data from the student table.

2. PreparedStatement Example
File: Jdbc_preparedstatement.java

Demonstrates executing a parameterized SQL query using PreparedStatement.

Helps prevent SQL injection and allows dynamic queries.

Usage
Compile the program:

bash
Copy code
javac Jdbc_statement.java
javac Jdbc_preparedstatement.java
Run the program:

bash
Copy code
java Jdbc_statement
java Jdbc_preparedstatement
Observe the output displaying student data from your PostgreSQL database.

License
This project is open source and free to use for learning purposes.

Author
Shreyash Umesh Kolhe

GitHub: Shreyashkolhe22

Email: shreyashkolh@gmail.com
