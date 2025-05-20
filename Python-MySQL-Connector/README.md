# Three-Tier Python App with MySQL Connector

## 📚 Introduction

A simple 3-tier application written in Python that connects to a MySQL database.

## 🧩 Features
- Retrieves a specified number of author names from a MySQL database
- Allow user to add new authors via terminal input
- A standalone python script that verifies that MySQL is running

## 📂 File Structure
- present.py (presentation layer): (CLI) and user interaction
- app.py (application layer): logic between presentation and data
- myDB.py (data layer): handles the SQL queries
- test_connection.py: verify if MySQL is running

## 🧪 Prerequisites

### ✅ Python 3.x installed
- [Download Python](https://www.python.org/downloads/)

### ✅ MySQL Community Server
- [Download MySQL Community Server](https://dev.mysql.com/downloads/mysql/)

** Please make sure the MySQL service is running and that you are the 'root' user with access to a database named 'henry' (or whatever name you want to call but please make sure you change the code accordingly).

### ✅ MySQL Workbench (Optional but Recommended)
- [Download MySQL Workbench](https://dev.mysql.com/downloads/workbench/)

### ✅ Install the MySQL connector: (or pip3 if using Python 3)

`pip install mysql-connector-python` 

![Screenshot 2025-05-20 145757](https://github.com/user-attachments/assets/1a79256c-5bd4-4f87-8e63-15b9e8d7501c)

🗄️Database Setup
(If you change the names please make sure to change the code accordingly)
1. Create the database
```bash
CREATE DATABASE henry:
USE henry;
```
2. Create the **author** table
```bash
CREATE TABLE author (
    author_id INT AUTO_INCREMENT PRIMARY KEY,
    author_first VARCHAR(50),
    author_last VARCHAR(50)
);
```
![Screenshot 2025-05-20 145641](https://github.com/user-attachments/assets/8085219d-b89f-4f43-9158-598e220aa82e)

## 🚀 How to Run
1. Clone the repository:
```bash
git clone https://github.com/kndang/Cybersecurity-Portfolio/three-tier-python-mysql.git
cd three-tier-python-mysql
```
2. Run the **present** script:

`python present.py`

![image](https://github.com/user-attachments/assets/605333b1-fd8e-4f28-b9c1-9fa8d6e2185b)

**Result from MySQL Workbench after inputting data**

## 🧠 Skills Learned
- Writing python code across multuple layers
- Writing SQL queries, managing databases, performing inserts and selects
- How to Interact with a MySQL database from Python

## 🛠️Tools Used
- Python 3.13
- MySQL Server / MySQL Workbench
- Command Line Interface

## 🧪 Python Test Script
- in the script change the password and the name of your database if it's different.
- To use the script go to terminal:
  - Change to the directory where the script is located
  - Type the following:

`python test_connection.py`

![Screenshot 2025-05-20 145827](https://github.com/user-attachments/assets/45fe8bed-027a-4f5d-89b8-2b4cbfff4504)

**Successful Connection**

![image](https://github.com/user-attachments/assets/0251e4f4-3173-486d-b0ef-4d05d5a61507)

**Failed Connection**
