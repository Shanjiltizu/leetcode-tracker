-- Last updated: 09/07/2026, 09:51:16
# Write your MySQL query statement below
DELETE FROM Person
WHERE Id NOT IN (
    SELECT * FROM (
        SELECT MIN(Id)
        FROM Person
        GROUP BY Email
    ) AS temp
);