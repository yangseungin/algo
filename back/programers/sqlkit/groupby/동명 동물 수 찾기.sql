-- https://programmers.co.kr/learn/courses/30/lessons/59041
SELECT NAME, COUNT(DISTINCT ANIMAL_ID) from ANIMAL_INS group by NAME having COUNT(name)>1 order by name asc