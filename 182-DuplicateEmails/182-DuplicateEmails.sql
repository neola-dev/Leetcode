-- Last updated: 04/06/2026, 11:18:11
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;