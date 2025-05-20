# data layer

import mysql.connector
from mysql.connector import connect

class myDB:

    def __init__(self):
        try:
            self.c = connect(user="root", db="henry", password="kelly5355964623264")
        except mysql.connector.Error as err:
            raise

    def runQuery(self, query):
        try:
            cur = self.c.cursor()
            cur.execute(query)
            result = cur.fetchall()
            cur.close()
            return result
        except mysql.connector.Error as err:
            raise

    def getAuthorNames(self, n):
        query = "SELECT author_first, author_last FROM author LIMIT %s"
        try:
            cur = self.c.cursor()
            cur.execute(query, (n,))
            result = cur.fetchall()
            cur.close()
            return result
        except mysql.connector.Error as err:
            raise

    def newAuthorNames(self, first, last):
        query = "INSERT INTO author(author_first, author_last) VALUES (%s, %s)"
        try:
            cur = self.c.cursor()
            cur.execute(query, (first, last))
            self.c.commit()
            cur.close()
        except mysql.connector.Error as err:
            raise
        
    def close(self):
        self.c.close()
