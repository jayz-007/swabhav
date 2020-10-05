select customer.name,orders.order_date,product.name,product.price,line.quantity 
from customer
right join orders
on customer.id=orders.customer_id
right join line
on line.order_id=orders.id
right join product
on line.product_id=product.id
where customer.name ="abc";