

CREATE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance * 1.01
    WHERE AccountType = 'Savings';
END;
GO
 

EXEC ProcessMonthlyInterest;

SELECT * FROM Accounts;
