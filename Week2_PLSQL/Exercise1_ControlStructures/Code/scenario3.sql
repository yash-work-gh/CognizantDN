SELECT
    L.LoanID,
    C.Name,
    L.DueDate
FROM Loans L
JOIN Customers C ON L.CustomerID = C.CustomerID
WHERE L.DueDate BETWEEN GETDATE() AND DATEADD(DAY, 30, GETDATE());
