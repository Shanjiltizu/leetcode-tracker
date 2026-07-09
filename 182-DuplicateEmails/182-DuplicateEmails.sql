-- Last updated: 09/07/2026, 09:51:21
# Write your MySQL query statement below
SELECT DISTINCT p1.email
FROM Person p1
JOIN Person p2
ON p1.email = p2.email
AND p1.id != p2.id;