DELIMITER //
CREATE FUNCTION CapitalName(
input_name varchar(200)
)
RETURNS VARCHAR (20)
DETERMINISTIC 
BEGIN
DECLARE name varchar (299);
set name = upper(input_name);
RETURN (name);
END //

DELIMITER ;

select CapitalName('jay')