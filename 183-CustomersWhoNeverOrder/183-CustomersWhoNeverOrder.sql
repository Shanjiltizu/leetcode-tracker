-- Last updated: 09/07/2026, 09:51:24
SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId FROM Orders
);