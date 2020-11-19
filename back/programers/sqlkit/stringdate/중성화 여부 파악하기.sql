-- https://programmers.co.kr/learn/courses/30/lessons/59047
SELECT ANIMAL_ID, NAME from ANIMAL_INS
where ANIMAL_TYPE = "Dog" and name like "%EL%"
order by name asc