-- Last updated: 04/06/2026, 11:18:16
# Write your MySQL query statement below
select p.firstName, p.lastName, a.city, a.state 
from Person p
left join Address a on p.personId = a.personId;