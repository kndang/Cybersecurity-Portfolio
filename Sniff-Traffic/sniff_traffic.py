from scapy.all import *

def sniff_traffic():
    sniff(filter="tcp and ( port 80 or port 443 )", prn=lambda x: str(x[IP].src) + str("-->") + str(x[IP].dst) + " " + str(x[IP].len))
sniff_traffic()
    
