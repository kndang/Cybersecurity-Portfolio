# Project 3.1 (Doing Things in Order)

## 📝 Project Prompt
> There are three wizards and a merchant. The wizards want to make potions. Each potion requires equal portions of **dragon scale**, **toadstool**, and **mandrake root**.  
>
> - Wizard #1 has an unlimited amount of **dragon scale**.  
> - Wizard #2 has an unlimited amount of **toadstool**.  
> - Wizard #3 has an unlimited amount of **mandrake root**.  
>
> The merchant has an unlimited supply of all three ingredients. She randomly chooses **two different** ingredients and offers them to the wizards.  
>
> - The wizard that has the **missing third ingredient** should make the potion.
> - The process then repeats.
>
> All characters (three wizards and the merchant) run in separate threads. The merchant should wait for the wizard to finish making a potion before offering a new combination. Synchronization should be implemented using condition variables or semaphores.

## 🧠 Skills Demonstrated
- Python multithreading
- Semaphore-based synchronization

## 🛠️Tools Used
- Python 3.x
- 'threading' module
- 'Semaphore'
- 'random' module
- 'time.sleep()'

## 🔧 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/kndang/Cybersecurity-Portfolio.git
   cd Cybersecurity-Portfolio/Project-3.3.py
2. Run the script:
   
   `python Project 3.3.py`

## 📸 Sample Output

![image](https://github.com/user-attachments/assets/b5bdf861-6d31-43cc-9264-2b2c3d6809ac)
