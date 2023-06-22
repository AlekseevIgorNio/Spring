DROP TABLE IF EXISTS books;

CREATE TABLE authors
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    firstname  VARCHAR(250) NOT NULL,
    lastname   VARCHAR(250) NOT NULL,
    patronymic VARCHAR(250)
);

CREATE TABLE books
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    author_id VARCHAR(250) NOT NULL,
    title     VARCHAR(250) NOT NULL,
    price_old VARCHAR(250) DEFAULT NULL,
    price     VARCHAR(250) DEFAULT NULL
);

ALTER TABLE books
    ADD FOREIGN KEY (author_id)
        REFERENCES authors(id)