-- Last updated: 04/06/2026, 11:18:13
# Write your MySQL query statement below
SELECT DISTINCT l1.num AS ConsecutiveNums
FROM Logs l1, Logs l2, Logs l3
WHERE l1.num = l2.num
  AND l2.num = l3.num
  AND l1.id = l2.id - 1
  AND l2.id = l3.id - 1;