DROP PROCEDURE IF EXISTS TransferFunds;
GO

CREATE PROCEDURE TransferFunds
    @FromAccountID INT,
    @ToAccountID INT,
    @Amount DECIMAL(12,2)
AS
BEGIN
    BEGIN TRANSACTION;


    IF EXISTS (
        SELECT 1 FROM Accounts
        WHERE AccountID = @FromAccountID AND Balance >= @Amount
    )
    BEGIN

        UPDATE Accounts
        SET Balance = Balance - @Amount
        WHERE AccountID = @FromAccountID;


        UPDATE Accounts
        SET Balance = Balance + @Amount
        WHERE AccountID = @ToAccountID;

        COMMIT TRANSACTION;
    END
    ELSE
    BEGIN
        ROLLBACK TRANSACTION;
        RAISERROR('Transfer failed: Insufficient balance in source account.', 16, 1);
    END
END;
GO



EXEC TransferFunds @FromAccountID = 1, @ToAccountID = 4, @Amount = 3000.00;
SELECT * FROM Accounts;
