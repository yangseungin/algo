-- https://programmers.co.kr/learn/courses/30/lessons/59043
SELECT outs.ANIMAL_ID, outs.NAME
from ANIMAL_OUTS outs left outer join ANIMAL_INS ins
on outs.ANIMAL_ID = ins.ANIMAL_ID
where outs.DATETIME < ins.DATETIME
order by ins.DATETIME asc