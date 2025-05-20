#application layer

from myDB import myDB
import mysql.connector

class app:
    def __init__(self):
        try:
            self.db = myDB()
        except mysql.connector.Error as err:
            raise

    def getAuthorNames(self, n):
        try:
            result = self.db.getAuthorNames(n)
            return result
        except mysql.connector.Error as err:
            raise

    def newAuthorName(self, first, last):
        try:
            self.db.newAuthorNames(first, last)
        except mysql.connector.Error as err:
            raise

    def done(self):
        self.db.close()
