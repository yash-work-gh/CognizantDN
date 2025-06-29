
IF OBJECT_ID('Accounts', 'U') IS NOT NULL DROP TABLE Accounts;
IF OBJECT_ID('Employees', 'U') IS NOT NULL DROP TABLE Employees;

CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY IDENTITY(1,1),
    CustomerID INT,
    Balance DECIMAL(12,2),
    AccountType NVARCHAR(20)  
);

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY IDENTITY(1,1),
    Name NVARCHAR(100),
    Department NVARCHAR(50),
    Salary DECIMAL(12,2)
);

INSERT INTO Accounts (CustomerID, Balance, AccountType) VALUES
(1, 10000.00, 'Savings'),   
(2, 7500.00, 'Savings'),   
(3, 5000.00, 'Current'),   
(4, 12000.00, 'Savings'); 

INSERT INTO Employees (Name, Department, Salary) VALUES
('Alice HR', 'HR', 60000.00),
('Bob Tech', 'IT', 80000.00),
('Charlie HR', 'HR', 58000.00),
('Diana Dev', 'IT', 90000.00);



SELECT * FROM Accounts;


SELECT * FROM Employees;


