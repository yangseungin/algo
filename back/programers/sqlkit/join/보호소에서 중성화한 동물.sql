-- https://programmers.co.kr/learn/courses/30/lessons/59045
SELECT ins.ANIMAL_ID, ins.ANIMAL_TYPE, ins.NAME
from ANIMAL_INS ins left outer join ANIMAL_OUTS outs
on ins.ANIMAL_ID = outs.ANIMAL_ID
where ins.SEX_UPON_INTAKE like "Intact%" and (outs.SEX_UPON_OUTCOME like "Spayed%" or outs.SEX_UPON_OUTCOME like "Neutered%" )
order by ins.ANIMAL_ID asc;
