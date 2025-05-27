#Kelly Dang

select * from Customer;
select * from Payment;
select * from Product;
select * from Transaction;
select * from Transaction_has_Payment;

# Single table queries
-- Shows the name and price of the most expensive product
select productName,unitPrice from Product
order by unitPrice desc
limit 1;

-- Lists the customers last and first name, where the ordering is by last name and then by first name in descending order
select lastName, firstName from customer
order by lastName, firstName desc;

-- Shows the average price of all products
select avg(unitPrice) as average from Product;

# Multiple table queries
-- Shows what product each customers bought order by the product name
select lastName,firstName,productName
from customer,product
order by productName;

-- Shows how many purchases each customer made
select concat (firstName," ",lastName) as name,
count(quantity) as purchase
from customer join transaction using(customerID)
group by name;

-- Shows all the dates of transaction made by the customers
select lastName,firstName,
orderDate from customer,transaction,transaction_has_payment
where customer.customerID = 
transaction.customerID and
transaction.orderID = transaction_has_payment.orderID
order by lastName,firstName;