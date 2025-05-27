# 🧠 FCFS Scheduling Simulator

> A simple Python implementation of the **First-Come, First-Served (FCFS)** scheduling algorithm used in operating systems. This script reads process data from a text file and simulates their execution based on arrival time.

---

## 📚 About

FCFS is one of the simplest CPU scheduling algorithms. In FCFS, the process that arrives first is executed first. This script models that behavior and prints a timeline showing when each process starts and finishes.

---

## ⚙️ How It Works

- Reads all lines from a text file (`p1.txt` by default in the code).
- Parses each line into a process with `<ProcessName> <ArrivalTime> <BurstTime>`
  - `ProcessName`: Unique identifier (e.g., A, B, C)
  - `ArrivalTime`: The time the process arrives
  - `BurstTime`: The execution time required
- If CPU is idle, it adds `*Free*`.
- When a process starts, it adds `*STARTING*`.

---

## 🖥️ Output Example (of `p1.txt`):

![image](https://github.com/user-attachments/assets/3f460040-ad30-4260-b362-43e83d782478)

---

## 🏁 Getting Started

### Prerequisites

- Python 3.x installed on your system.

### Running the Program

1. Clone the repository:
   ```bash
   git clone https://github.com/kndang/Cybersecurity-Portfolio.git
   cd Cybersecurity-Portfolio/First-Come-First-Served
   
2. Make sure your input file (p1.txt) is present in the same directory.

3. Run the program:
`python fcfs.py`

---

## 🧪 Test Files

This repository includes **three test files**:

- `p1.txt`
- `p2.txt`
- `p3.txt`

You can use any of these files to test the simulation. Simply change the filename in the code:

```python
text_file = [line.strip() for line in open('p1.txt')]  # or p2.txt, p3.txt
```

## 🛠️ Tools Used

- Python 3.13

## 🧑‍💻 Skills Demonstrated

- Operating system concepts (FCFS scheduling)
- File I/O
- Error handling in Python
