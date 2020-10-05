select customer.name,orders.order_date,product.name,product.price,line.quantity 
from customer
inner join orders
on customer.id=orders.customer_id
inner join line
on line.order_id=orders.id
inner join product
on line.product_id=product.id
where orders.order_date='2020-09-20';