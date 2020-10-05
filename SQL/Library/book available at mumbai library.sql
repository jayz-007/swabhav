SELECT Library.id as 'lib id',library.bookid,book.name 
FROM library
RIGHT JOIN book ON library.bookid = book.id
where DATEDIFF(CURDATE(),book.duedate)/365 >0 and library.location='Mumbai';
