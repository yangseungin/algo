-- https://programmers.co.kr/learn/courses/30/lessons/59411
SELECT ins.ANIMAL_ID, ins.NAME from ANIMAL_INS ins
left outer join ANIMAL_OUTS outs
on ins.ANIMAL_ID = outs.ANIMAL_ID
where outs.ANIMAL_ID is not null
order by ins.DATETIME-outs.DATETIME limit 2