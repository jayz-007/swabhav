CREATE TABLE Book (
    id int NOT NULL,
    name varchar(255),
    author varchar(255),
    duedate Date,
    PRIMARY KEY(id)
);

CREATE TABLE Library (
    id int NOT NULL,
    name varchar(255),
    location varchar(255),
    bookid int,
    Foreign Key(bookid) references Book(id),
    PRIMARY KEY(id)
);
Insert into Book values(8,'Harry Potter 8','J.K rowling','2020-9-2');
Insert into Library values(102,'GC library','Mumbai',8);