INSERT INTO "degree" (name, honours, total_credits)
VALUES
('Computer Science', FALSE, 90),
('Computer Security', TRUE, 120);

INSERT INTO "app_user" (email, password, degree_id) 
VALUES
('allister.lobo@gmail.com', 'AL321!', 1),
('simifbenro@hotmail.com', 'SF123!', 2);

INSERT INTO "course" (code, name, credits)
VALUES
('EECS 2030', 'Advanced Object-Oriented Programming', 3),
('EECS 3421', 'Computer Organization', 4);

INSERT INTO "enrollment" (user_id, course_id, status)
VALUES
(
  (SELECT id FROM app_user WHERE email = 'allister.lobo@gmail.com'),
  (SELECT id FROM course WHERE code = 'EECS 2030'),
  'Enrolled'
);
