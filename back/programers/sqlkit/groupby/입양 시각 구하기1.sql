-- https://programmers.co.kr/learn/courses/30/lessons/59412
SELECT date_format(DATETIME,'%H')as hour,count(DATETIME)
from ANIMAL_OUTS
group by hour
HAVING hour between 9 and 19 order by hour