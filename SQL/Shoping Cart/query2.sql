select customer.name,orderssk.order_date,product.name,product.price,line.quantity 
from customer
inner join orders
on customer.id=orders.customer_id
inner join line
on line.order_id=orders.id
inner join product
on line.product_id=product.id
order by orders.order_date;