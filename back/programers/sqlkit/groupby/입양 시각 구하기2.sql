-- https://programmers.co.kr/learn/courses/30/lessons/59413
SET @hour := -1;

SELECT (@hour:=@hour +1) as HOUR, (select count(*) from animal_outs where hour(datetime)=@hour) as COUNT
from animal_outs
where @hour < 23;