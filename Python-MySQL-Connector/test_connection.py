import mysql.connector
from mysql.connector import Error

def test_connection():
    try:
        conn = mysql.connector.connect(
            host="localhost",
            user="root",
            password="*************",   # Replace this with your root password
            database="henry"            # Replace this if your DB name is different
        )
        if conn.is_connected():
            print("✅ Connection successful!")
            cursor = conn.cursor()
            cursor.execute("SELECT DATABASE();")
            db = cursor.fetchone()
            print(f"Connected to database: {db[0]}")
            cursor.close()
        else:
            print("❌ Connection failed.")
        conn.close()

    except Error as e:
        print("❌ Error while connecting to MySQL:", e)

test_connection()
