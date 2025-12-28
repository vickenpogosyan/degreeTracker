INSERT INTO "degree" (name, honours, total_credits)
VALUES
('Computer Science', FALSE, 90),
('Computer Security', TRUE, 120);

INSERT INTO "app_user" (email, password) 
VALUES
('allister.lobo@gmail.com', 'AL321!'),
('simifbenro@hotmail.com', 'SF123!');

INSERT INTO "course" (code, name, credits)
VALUES
(2030, 'Advanced Object-Oriented Prograaming', 3),
(3421, 'Computer Organization', 4);

INSERT INTO "enrollment" (user_id, course_id, status)
VALUES
(1, 1 , 'Enrolled'),
(1, 2, 'Not Completed'),
(2, 2, 'Completed');