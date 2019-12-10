CREATE DATABASE business;

CREATE TABLE IF NOT EXISTS users(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    login VARCHAR(128),
    password VARCHAR(128),
    role VARCHAR(32)
);

CREATE TABLE IF NOT EXISTS developers(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    surname VARCHAR(128),
    country VARCHAR(128),
    user_id INT FOREIGN KEY references users(id)
);

CREATE TABLE IF NOT EXISTS developers(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    surname VARCHAR(128),
    country VARCHAR(128),
    developer_id INT FOREIGN KEY references users(id)
);

CREATE TABLE IF NOT EXISTS startupers(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    surname VARCHAR(128),
    country VARCHAR(128),
    experience VARCHAR(128),
    startuper_id INT FOREIGN KEY references users(id)
);

CREATE TABLE IF NOT EXISTS investors(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    surname VARCHAR(128),
    country VARCHAR(128),
    budget VARCHAR(128),
    investor_id INT FOREIGN KEY references users(id)
);


CREATE TABLE IF NOT EXISTS projects(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    data VARCHAR(128),
    describe VARCHAR(128),
    investor_id INT FOREIGN KEY references users(id)
);

CREATE TABLE IF NOT EXISTS helperTables(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    user_id INT FOREIGN KEY references users(id)
);

CREATE TABLE IF NOT EXISTS comments(
    id SERIAL PRIMARY KEY,
    user VARCHAR(128),
    text VARCHAR(128),
    date VARCHAR(128),
    project_id INT FOREIGN KEY references projects(id)
);
CREATE TABLE IF NOT EXISTS contests(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    participants VARCHAR(128),
    data VARCHAR(128),
    conditions VARCHAR(128)
);

CREATE TABLE IF NOT EXISTS requests(
    id SERIAL PRIMARY KEY,
    data VARCHAR(128),
    participant VARCHAR(128),
    contest_name VARCHAR FOREIGN KEY references connects(name)
);