IF OBJECT_ID('dbo.Loans', 'U') IS NOT NULL
    DROP TABLE Loans;

IF OBJECT_ID('dbo.Customers', 'U') IS NOT NULL
    DROP TABLE Customers;

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY IDENTITY(1,1),
    Name NVARCHAR(100),
    Age INT,
    Balance DECIMAL(12,2),
    IsVIP BIT DEFAULT 0
);


CREATE TABLE Loans (
    LoanID INT PRIMARY KEY IDENTITY(1,1),
    CustomerID INT,
    InterestRate DECIMAL(5,2),
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);



INSERT INTO Customers (Name, Age, Balance) VALUES
('John Senior', 65, 15000.00),    
('Mary Young', 30, 9000.00),  
('VIP Candidate', 40, 20000.00); 


INSERT INTO Loans (CustomerID, InterestRate, DueDate) VALUES
(1, 8.5, GETDATE() + 10),
(2, 9.0, GETDATE() + 40),
(3, 7.5, GETDATE() + 5);  


SELECT * from Customers;
SELECT * from Loans;