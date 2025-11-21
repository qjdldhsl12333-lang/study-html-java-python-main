-- 문제 6 컴퓨터공학과 학생만 조회하시오.
SELECT s.student_id ,s.name ,d.department_name 
FROM departments d 
join student s 
on s.department_id = d.department_id 
where d.department_name = '컴퓨터공학과';
-- 문제 7) 성적(score)이 80점 이상인 학생 이름과 점수를 조회하시오.
select s.name, e.score 
from departments d 
join student s  
on d.department_id =s.department_id 
join enrollments e 
on s.student_id  =e.student_id 
where e.score >= 80;
-- 문제 8) 학생 이름을 오름차순으로 정렬해 조회하시오.
select s.name
from student s 
order by name asc;
-- 문제 9) 성적을 내림차순 정렬 후 상위 3명의 이름과 점수를 조회하시오.
select s.name ,e.score
from student s 
join enrollments e 
on s.student_id =e.student_id 
order by e.score desc
limit 3;
-- 3. JOIN 실습 문제
-- 문제 10) 학생 이름, 학과명, 수강 과목명, 성적을 JOIN하여 조회하시오.
-- 필요 테이블
-- student
-- departments
-- enrollments
-- courses
select s.name, d.department_name, c.course_name, e.score 
from departments d
join student s
on d.department_id =s.department_id 
join enrollments e
on e.student_id =s.student_id 
join courses c
on c.course_id = e.course_id ;
-- 문제 11) 성적이 없는 학생(수강 안한 학생)을 LEFT JOIN으로 조회하시오.
-- 문제 12) 과목별 평균 점수를 조회하시오. (JOIN + GROUP BY)
-- 문제 13) 학생 이름, 과목명, 성적을 포함하는 vw_student_scores VIEW를 생성하시오.
-- 문제 14) VIEW에서 성적이 90점 이상인 학생을 조회하시오.

-- 5. 서브쿼리 실습 문제
-- 문제 15) 전체 평균 점수보다 높은 학생 이름과 점수를 조회하시오.
-- 문제 16) ‘데이터베이스’ 과목 평균보다 점수가 높은 학생을 조회하시오.
-- 문제 17) 가장 많은 과목을 수강한 학생의 이름과 수강 개수를 조회하시오.