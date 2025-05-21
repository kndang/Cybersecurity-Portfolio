# Project 3.2 (Professor and Students Log-in)

## 📝 Project Prompt
> There is a professor and 5 students, each running in separate threads.
> There can be any number of students on the system at the same time, but if there are any students on the system, the professor is not allowed on the system until.   
> Once the professor is on the system, students are not allowed on the system until the professor leaves.  
> Each student should wait a random amount of time from 5 to 10 seconds before logging into the system. Once they are on, they spend 1 to 2 seconds on the system (simulated just by having them
 sleep), and then they leave the system.
> Whenever a student logs on or off, print out their name (1 to 5) and how many students are on the system. All of this runs continuously in a while true loop.
> The professor should wait a random amount of time from 1 to 3 seconds before logging into the system. 
> Once the professor is on, they will be on from 1 to 5 seconds (simulated by having them sleep), and then they leave the system. Whenever the professor logs on or off, print a message indicating that. All of this runs continuously in a while true loop.

## 🧠 Skills Learned
- Python multithreading
- Thread synchronization using semaphore and lock
  
## 🛠️Tools Used
- Python 3.x
- 'threading' module
- 'random' module
- 'time,sleep'
- 'lock'

## 🔧 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/kndang/Cybersecurity-Portfolio.git
   cd Cybersecurity-Portfolio/Project-3.2-Threading

2. Run the script:
   
   `python Project 3.2.py`

## 📌 Notes
This program runs infinitely until manually stopped.

## 📤 Sample Output
![image](https://github.com/user-attachments/assets/12e42725-1967-4040-a640-1c603dd3ac6a)
