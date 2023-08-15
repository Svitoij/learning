create type roles as enum ('jobseeker', 'recruiter')

CREATE TABLE users (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    gender VARCHAR(7) NOT NULL,
    email VARCHAR(100),
    status roles,
    UNIQUE(email)
);

CREATE TABLE vacancies (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(50),
    description TEXT,
    salary DECIMAL(10, 2),
);

create table company (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

create table users_vacancies (
    user_id BIGINT REFERENCES users(id),
    vacancy_id BIGINT REFERENCES vacancies(id)
);

create table company_vacancies (
    company_id BIGINT REFERENCES company(id),
    vacancy_id BIGINT REFERENCES vacancies(id)
);
