#Kelly Dang
create database store;
use store;

create table Customer (
customerID int primary key,
firstName varchar(45),
lastName varchar(45),
email varchar(45),
phoneNum varchar(45),
streetName varchar(45),
city varchar(45),
state varchar(45),
zipCode int);

create table Payment (
paymentID int primary key,
paymentDate date,
customerID int,
constraint fk_customer_customerID
foreign key (customerID)
references customer(customerID));

create table Product (
productID int primary key,
productName varchar(45),
unitPrice int,
category varchar(45),
brand varchar(45),
size varchar(45),
color varchar(45),
warrantyExp date);

create table Transaction(
orderID int primary key,
orderDate date,
quantity int, 
customerID int,
paymentID int,
productID int,
constraint fk_order_cusID
foreign key(customerID)
references Customer(customerID),
constraint fk_payment_payID
foreign key(paymentID)
references Payment(paymentID),
constraint fk_product_proID
foreign key(productid)
references Product(productID)
);

create table Transaction_has_Payment (
orderID int,
customerID int,
paymentID int,
primary key (orderID, customerID, paymentID),
constraint fk_transaction
foreign key (orderID)
references Transaction(orderID),
constraint fk_customerID
foreign key (customerID)
references Customer(customerID),
constraint fk_paymentID
foreign key (paymentID)
references Payment(paymentID));

insert into Customer (customerID, firstName, lastName, email, phoneNum, streetName, city, state, zipCode)
values 
(1, "John","Doe","johndoe@yahoo.com","2029372516","1231 Old Emmitsburg Rd","Emmitsburg","MD",21727),
(2, "Jane","Smith","janesmith@gmail.com","2407352846","012 Old Frederick Blvd","Frederick","MD",21703),
(3, "Alex","Johnson","alexajohn@hotmail.com","3019328565","143 Main St","Rockville","MD",20850),
(4, "Ben","Williams","bnwill@protonmail.com","2027735493","3916 Street Ave","Bethesda","MD",20817),
(5, "Carter","Davis","davis_carter@msn.com","3018562424","0001 Bored Ln","Annapolis","MD",21401);

insert into Payment (paymentID, paymentDate, customerID)
values
(01,20191017,1),
(02,20191019,2),
(03,20191022,3),
(04,20191101,4),
(05,20191115,5);

insert into Product(productID, productName, unitPrice, category, brand, size, color, warrantyExp)
values
(010,"Screwdriver Set",17.99,"Tools & Home Improvement","Phillips","8 in","Orange",20201017),
(020,"Dash Camera",44.99,"Cell Phones & Accessories","Apeman","3 in","black",20201020),
(030,"LED strip lights",36.98,"Lights & Lighting Accessories","HOLDCY","6 meters","Multi-color",20201022),
(040,"Bubble Machine",19.99,"Toys & Games","Biolotter","9 in","blue",20201101),
(050,"Surge Protector",26.31,"Electronics","Bel)kin","12 in","White",20201115);

insert into Transaction (orderID, orderDate, quantity, customerID, paymentID,productID)
values
(10,20191017,5,1,01,010),
(20,20191019,2,2,02,020),
(30,20191101,1,3,03,030),
(40,20191101,5,4,04,040),
(50,20191115,3,5,05,050),
(60,20191101,1,2,02,020),
(70,20191119,2,4,04,030),
(80,20191221,6,3,03,040),
(90,20191222,3,1,01,050),
(100,20191223,1,5,05,010);

insert into Transaction_has_Payment(orderID, customerID, paymentID)
values
(10,1,01),
(20,2,02),
(30,3,03),
(40,4,04),
(50,5,05),
(60,02,02),
(70,04,03),
(80,03,04),
(90,01,05),
(100,05,01);