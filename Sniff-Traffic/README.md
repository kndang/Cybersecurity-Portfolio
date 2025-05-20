# SniffTraffic

👃 Introduction

A simple python script that uses Scapy to capture and display TCP traffic on port 80 (HTTP) and port 443 (HTTPS).

## 📌 Features
- Sniffs live TCP traffic on port 80 and port 443 (HTTP/HTTS)
- Extracts and displays: Source IP, Dst IP, and packet size (in bytes)
- Utilize the Scapy library in Python

## 🖥️ Skills Learned
- Hands-on experience with capturing live network traffic using Scapy.
- Understood the logic behind filtering to capture specific network traffic
- Learned how to extract metadata

## 🛠️ Tools Used
- Python 3.13
- `scapy` library

## 🔍 How to Run 
1. Ensure Python 3.13 is installed.

2. Install the required library:

    `pip install scapy`

3. Use sudo to run this script: (Packet sniffing requires elevated privileges)

   `sudo python3 sniff.py`

4. Output should look something like this:

   `192.168.1.10 --> 172.217.11.46 60`
   
   `192.168.1.10 --> 172.217.11.46 1500`

## 🕵️ What does this info tell us?
Using the code above as an example we can tell that a TCP packet was sent from 192.168.1.10 to 172.217.11.46 with a length of 60 bytes.

## ❌ How to Stop the Script?
press: `Ctrl + C`
