
CREATE PROCEDURE UpdateEmployeeBonus
    @Dept NVARCHAR(50),
    @BonusPercent DECIMAL(5,2)
AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * @BonusPercent / 100.0)
    WHERE Department = @Dept;
END;
GO


EXEC UpdateEmployeeBonus @Dept = 'HR', @BonusPercent = 10.0;
SELECT * FROM Employees;
