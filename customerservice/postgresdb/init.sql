-- Create a new database
CREATE DATABASE postgres;

-- Connect to the new database
\c postgres;

-- Create a new user with a password
CREATE USER postgres WITH ENCRYPTED PASSWORD 'postgres';

-- Grant privileges to the new user
GRANT ALL PRIVILEGES ON DATABASE postgres TO postgres;

-- Create a sample table
CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    hire_date DATE
);

-- Insert sample data into the table
INSERT INTO employees (first_name, last_name, email, hire_date)
VALUES
('John', 'Doe', 'john.doe@example.com', '2024-09-02'),
('Jane', 'Smith', 'jane.smith@example.com', '2024-09-02');

