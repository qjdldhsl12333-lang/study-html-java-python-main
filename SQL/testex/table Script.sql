CREATE DATABASE IF NOT EXISTS study
CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci

create table student(
student_id int auto_increment primary key ,
name varchar(50),
grade int,
register_date DATE,
department_id int not null,
CONSTRAINT chk_grade CHECK (grade BETWEEN 1 AND 4),
constraint department_id_fk 
foreign key (department_id) 
references departments(department_id)
);
INSERT INTO student(name, grade, register_date, department_id)
VALUES 
('김민수', 1, '2023-03-02', 1),
('이서현', 2, '2022-03-02', 2),
('박지훈', 3, '2021-03-02', 1),
('최유진', 4, '2020-03-02', 3),
('정하늘', 1, '2023-03-02', 2);
drop table student ; 
drop table enrollments;
drop table attendance;
create table departments(
department_id INT primary key,
department_name VARCHAR(50) UNIQUE
);
insert into departments values
(1,'컴퓨터공학과'),
(2,'경영학과'),
(3,'전자공학과');

create table courses(
course_id INT primary key,
course_name VARCHAR(50) unique,
professor VARCHAR(50)
);
insert into courses values
(101,'데이터베이스','김교수'),
(102,'자바프로그래밍','이교수'),
(103,'회계학개론','박교수');
create table enrollments(
student_id int ,
course_id INT ,
score INT,
constraint student_id_fk foreign key (student_id) references student(student_id),
constraint course_id_fk foreign key (course_id) references courses(course_id),
CONSTRAINT pk_enroll PRIMARY KEY (student_id, course_id)
);
insert into enrollments values
(1, 101, 85),
(1, 102, 90),
(2, 103, 88),
(3, 101, 92),
(4, 102, 70);

create table attendance(
log_id INT primary key,
student_id int,
checkin_time DATETIME,
constraint students_id_fk foreign key (student_id) references student(student_id)
);
insert into attendance values
(1,1,'2024-05-01 09:00:00'),
(2,2,'2024-05-01 09:10:00'),
(3,3,'2024-05-01 09:05:00');











