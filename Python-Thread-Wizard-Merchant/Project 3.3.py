#Kelly Dang
#Project 3 #3: Wizards & Merchants

from threading import Thread, Semaphore, Lock
from time import sleep
import random

# Semaphores for wizards
wizard1_sem = Semaphore(0)
wizard2_sem = Semaphore(0)
wizard3_sem = Semaphore(0)

# Used by wizards to tell the merchant "done"
potion_done = Semaphore(0)

ingredients_list = ["dragon scale", "toadstool", "mandrake root"]

def wizard(name, semaphore):
    while True:
        semaphore.acquire()
        print(f"{name} is making a potion...")
        sleep(1)
        print(f"{name} made a potion.\n")
        potion_done.release()

def merchant():
    while True:
        # Randomly select 2 ingredients
        offered = random.sample(ingredients_list, 2)
        print(f"Merchant offers: {offered[0]} and {offered[1]}.")

        # Determine which wizard has the missing ingredient
        missing = list(set(ingredients_list) - set(offered))[0]

        if missing == "dragon scale":
            wizard1_sem.release()
        elif missing == "toadstool":
            wizard2_sem.release()
        else:
            wizard3_sem.release()

        # Wait for the wizard to finish before continuing
        potion_done.acquire()

        sleep(0.5)  # Small pause for readability

# Thread setup
w1 = Thread(target=wizard, args=("Wizard A (has dragon scale)", wizard1_sem))
w2 = Thread(target=wizard, args=("Wizard B (has toadstool)", wizard2_sem))
w3 = Thread(target=wizard, args=("Wizard C (has mandrake root)", wizard3_sem))
m = Thread(target=merchant)

# Start threads
w1.start()
w2.start()
w3.start()
m.start()

