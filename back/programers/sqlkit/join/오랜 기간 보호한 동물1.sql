-- https://programmers.co.kr/learn/courses/30/lessons/59044
SELECT ins.name, ins.DATETIME from ANIMAL_INS ins
left outer join ANIMAL_OUTS outs
on ins.ANIMAL_ID = outs.ANIMAL_ID
where outs.ANIMAL_ID is null
order by ins.DATETIME limit 3;