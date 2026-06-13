# Write your MySQL query statement below
SELECT w.id
FROM Weather as w
JOIN Weather as w1 ON DATEDIFF(w.recordDate ,w1.recordDate) = 1
WHERE w.temperature > w1.temperature