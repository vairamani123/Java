--Day 11 Task (05-06-2023)


CREATE TABLE Orders(orderNumber number(5) NOT NULL,paymentState VARCHAR(12),creationTime DATE,totalAmount number(5),
PRIMARY KEY (orderNumber));

alter table Orders add custId number(5) NOT NULL;

alter table Orders add constraint fk_cust_orders FOREIGN KEY(custId) REFERENCES Customers(custId);
desc Orders;


CREATE TABLE Products(prodId number(5) NOT NULL,pname VARCHAR(20),price number(5),PRIMARY KEY(prodId));

CREATE TABLE Customers(custId number(5)NOT NULL,cname VARCHAR(20),phone VARCHAR(20),PRIMARY KEY(custId));

CREATE TABLE OrderDetail(orderNumber number(5) NOT NULL,prodId number(5) NOT NULL,
			FOREIGN KEY(orderNumber) REFERENCES Orders(orderNumber),
			FOREIGN KEY(prodId) REFERENCES Products(prodId));

insert into Products values(101,'Watch',4000);
insert into Products values(102,'Laptop',50000);
insert into Products values(103,'Mobile',20000);
insert into Products values(104,'Wallet',1000);
insert into Products values(105,'Bag',3500);

select * from Products;


insert into Customers values(11,'Gokul',9952531247);
insert into Customers values(12,'Abi',9230181732);
insert into Customers values(13,'Yash',7987635410);
insert into Customers values(14,'Ganesh',8674392030);
insert into Customers values(15,'Vijay',98400324781);

select * from Customers;

insert into Orders values(1,'Success','12-01-2021',3000,11);
insert into Orders values(2,'Success','09-12-2022',50000,12);
insert into Orders values(3,'Failed','11-09-2021',4000,13);
insert into Orders values(4,'Failed','15-02-2023',2000,14);
insert into Orders values(5,'Success','23-01-2022',3000,14);
select * from Orders;

insert into OrderDetail values(1,101);
insert into OrderDetail values(1,102);
insert into OrderDetail values(2,101);
insert into OrderDetail values(3,102);
insert into OrderDetail values(4,104);
insert into OrderDetail values(5,105);

select * from OrderDetail;
