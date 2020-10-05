SELECT Library.id as 'lib id',library.bookid,book.name 
FROM library
RIGHT JOIN book ON library.bookid = book.id
where library.id=101;
