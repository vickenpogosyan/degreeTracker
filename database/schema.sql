CREATE TABLE degree (
    id smallint GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR NOT NULL,
    honours BOOLEAN NOT NULL,
    total_credits smallint NOT NULL
);

CREATE TABLE app_user (
    id smallint GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    email VARCHAR NOT NULL UNIQUE,
    password VARCHAR NOT NULL,
    degree_id smallint NOT NULL,

    CONSTRAINT fk_user_degree
        FOREIGN KEY (degree_id)
        REFERENCES degree(id)
        ON DELETE CASCADE
);

CREATE TABLE course (
    id smallint GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    code INT NOT NULL UNIQUE,
    name VARCHAR NOT NULL,
    credits smallint NOT NULL
);

CREATE TABLE enrollment (
    id smallint GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id smallint NOT NULL,
    course_id smallint NOT NULL,
    status VARCHAR NOT NULL 
        CHECK (status IN ('Completed', 'Enrolled', 'Not Completed')),

    CONSTRAINT fk_enrollment_user
        FOREIGN KEY (user_id)
        REFERENCES app_user(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_enrollment_course
        FOREIGN KEY (course_id) 
        REFERENCES course(id)
        ON DELETE CASCADE,

    CONSTRAINT unique_user_course
        UNIQUE (user_id, course_id)
);