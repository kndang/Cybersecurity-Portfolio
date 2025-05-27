# 🛒 Order Transactions Database Project

> This project is a relational database designed to track customer order transactions, created as part of a Database Management Systems course. It demonstrates complete database lifecycle skills: modeling, schema definition, sample data population, and analytical SQL queries.

## 📘 Project Description

The database tracks:

- **Customers** and their personal information
- **Payments** made by customers
- **Transactions** (orders) associated with both customers and payments
- **Products** involved in each transaction

## 🗂️ Database Structure

### Entities

#### Customer
- `customerID`, `firstName`, `lastName`, `email`, `phoneNum`, `streetName`, `city`, `state`, `zipCode`

#### Payment
- `paymentID`, `paymentDate`, `customerID` (FK)

#### Product
- `productID`, `productName`, `unitPrice`, `category`, `brand`, `size`, `color`, `warrantyExp`

#### Transaction
- `orderID`, `orderDate`, `quantity`, `customerID` (FK), `paymentID` (FK), `productID` (FK)

#### Transaction_has_Payment
- Join table for complex linkage
- Composite PK: (`orderID`, `customerID`, `paymentID`)

![image](https://github.com/user-attachments/assets/f610956c-15a9-4e57-8c05-4225e964bede)

**Database structure in MySQL Workbench**

### 🔗 Relationships

- One **Customer** → Many **Payments**
- One **Customer** → Many **Transactions**
- One **Payment** → Many **Transactions**
- One **Transaction** ↔️ Many **Products**

## 🖼️ Entity-Relationship Diagram

See [`Model.pdf`](Model.pdf) for the complete database schema ERD.

## 📂 Project Files

| File | Description |
|------|-------------|
| `database.sql` | SQL script to create the schema and insert sample data |
| `queries.sql` | SQL script with example queries (SELECTs, joins, aggregates) |
| `Model.pdf` | Entity-Relationship Diagram |

## 🧰 Tools Used
- MySQL Workbench
- MySQL Server

## 🚀 How to Run

1. Open **MySQL Workbench**.
2. Create a new schema or use the `CREATE DATABASE` command in `database.sql`.

![image](https://github.com/user-attachments/assets/ce0a7835-1336-45ce-8ddd-14a518da035b)

**A database called store should pop up on the left hand side under the schemas window.**

3. Run `database.sql` to create tables and insert daata.
4. Run `queries.sql` to explore data through SQL queries.

![image](https://github.com/user-attachments/assets/c7ead295-4748-404f-a697-16ca83acca23)

**Table that displays the name and price of the most expensive product.**


## 📊 Sample Queries Include:

- Selecting the most expensive product
- Sorting customers by last and first name
- Calculating average product price
- Showing the products each customer purchased
- Counting how many purchases each customer made
- Listing transaction dates for each customer

## 🧠 Skills Demonstrated

  - Realistic simulation of order processing
  - Wrote scripts to create and manage schema
  - Designed tables with clear entity relationships


