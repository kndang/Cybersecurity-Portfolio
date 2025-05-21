#Kelly Dang
#Project 3.1: Doing Things in Order

from threading import *
from time import sleep
from random import randint
import threading

def f():
    sleep(randint(1,20)/10)
    print("1 end")
    semaphore.release()

def g():
    sleep(randint(1,20)/10)
    semaphore.acquire()
    print("2 end")
    semaphore2.release()

def h():
    sleep(randint(1,20)/10)
    semaphore2.acquire()
    print("3 end")

          
semaphore = Semaphore(0)
semaphore2 = Semaphore(0)


t1 = threading.Thread(target = f)
t2 = threading.Thread(target = g)
t3 = threading.Thread(target = h)
t1.start()
t2.start()
t3.start()
t1.join()
t2.join()
t3.join()


