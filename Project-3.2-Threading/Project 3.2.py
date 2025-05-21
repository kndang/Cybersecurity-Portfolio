#Kelly Dang
#Project 3.2: Professors and Students

from threading import *
from time import sleep
import random
import array as arr

count = 0

def professor(name):
    while True:
        sleep(random.randint(1,3)) 
        semaphore.acquire()
        print("Professor logs on")
        sleep(random.randint(1,5))
        print("Professor logs off")
        semaphore.release()
        
def student(name):
    global count
    while True:
        sleep(random.randint(5,10))
        lock.acquire()
        if count == 0:
            semaphore.acquire()
        count += 1
        print("Student", name, "logs on.", "Currently", count, "student(s).")
        lock.release()

        sleep(random.randint(1,2))

        lock.acquire()
        count -= 1
        print("Student", name, "logs off.", "Currently", count, "student(s).")
        if count == 0:
            semaphore.release()
        lock.release()
 
            
semaphore = Semaphore(1)

p1 = Thread(target=professor, args=('P1',))
s1 = Thread(target=student, args=('S1',))
s2 = Thread(target=student, args=('S2',))
s3 = Thread(target=student, args=('S3',))
s4 = Thread(target=student, args=('S4',))
s5 = Thread(target=student, args=('S5',))

lock = Lock()

p1.start()
s1.start()
s2.start()
s3.start()
s4.start()
s5.start()

p1.join()
s1.join()
s2.join()
s3.join()
s4.join()
s5.join()
