DROP TABLE IF EXISTS books;

CREATE TABLE authors
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    firstname   VARCHAR(250) NOT NULL,
    lastname    VARCHAR(250) NOT NULL,
    photo       VARCHAR(255),
    description TEXT,
    patronymic  VARCHAR(250)
);

CREATE TABLE books
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    pub_date      DATE         NOT NULL,
    is_bestseller TINYINT      NOT NULL,
    title         VARCHAR(250) NOT NULL,
    price_old     VARCHAR(250) DEFAULT NULL,
    price         VARCHAR(250) DEFAULT NULL,
    image         VARCHAR(255),
    description   TEXT
);

CREATE TABLE genre
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    parent_id INT,
    lvl       INT          DEFAULT 0 NOT NULL,
    slug      VARCHAR(250)           NOT NULL,
    name      VARCHAR(250) DEFAULT NULL
);

CREATE TABLE book2genre
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    book_id  INT NOT NULL,
    genre_id INT NOT NULL
);

CREATE TABLE book2author
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    book_id    INT NOT NULL,
    author_id  INT NOT NULL,
    sort_index INT NOT NULL DEFAULT 0
);

ALTER TABLE book2genre
    ADD FOREIGN KEY (book_id)
        REFERENCES books (id);

ALTER TABLE book2genre
    ADD FOREIGN KEY (genre_id)
        REFERENCES genre (id);

ALTER TABLE book2author
    ADD FOREIGN KEY (book_id)
        REFERENCES books (id);

ALTER TABLE book2author
    ADD FOREIGN KEY (author_id)
        REFERENCES authors (id);