-- Last updated: 04/06/2026, 11:18:14
# Write your MySQL query statement below

SELECT score, DENSE_RANK() OVER (ORDER BY score DESC) as `rank`
FROM Scores;