# ☁️🧱 Azure Fundamentals: Implementing Network Security Groups (NSGs)

This project demonstrates how to secure Azure Virtual Machines (VMs) using Network Security Groups (NSGs). NSGs act as virtual firewalls, controlling inbound and outbound traffic to Azure resources. This hands-on lab walks through setting up a VM, configuring network security, and applying best practices for traffic management.

## 🧰 Tools & Technologies

- Azure Portal
- Azure Virtual Machines
- Azure Virtual Networks (VNet)
- Azure Network Security Groups (NSG)

## 🛠 Lab Setup Instructions
### 🔑 Prerequisites

- Azure account (free trial available)
- Basic understanding of networking and cloud computing

## 🧪 Exercises

### Exercise 1: Create a Virtual Network and Subset

- Go to Azure Portal > Create a resource > Virtual Network
- Settings used:
  - Name: myVNet
  - Resource Group: myResourceGroup
  - Address space: 10.0.0.0/16
  - Subnet name: mySubnet
  - Subnet address range: 10.0.1.0/24

### Exercise 2: Launch a Virtual Machine
1. Create a new Virtual Machine
2. Under the  “Availability options” dropdown select the following: "No infrastructure redundancy required"
3. Use the following:
   - Name: myVM
   - Image: Windows Server 2019 Datacenter
   - Size: B1s
   - Username: azureuser
   - Password: your secure password
   - Virtual network: myVNet
   - Subnet: mySubnet
4. Deploy the VM

🔁 After That:
Scroll down to the Size section

Click "See all sizes"

You should now be able to pick:

B1s (Standard)

Or B1ms (fallback if B1s isn't there)



### Exercise 3: Create a Network Security Group (NSG)
- Create a Network Security Group
- Use:
  - Name: myNSG
  - Region: Same as the VM

### Exercise 4: Add Inbound and Outbound Rules
- Go to myNSG > Inbound Rules > Add rule:
  - Source: IP Addresses → Your IP
  - Port: 3389 (RDP)
  - Action: Allow
  - Priority: 1000
  - Name: Allow-RDP
- Ensure outbound rules allow all traffic by default

### Exercise 5: Associate NSG with VM
- Go to Networking on the VM or its Network Interface
- Under "Network security group", associate with *myNSG*

## 🧠 What I Learned

- Understand how to isolate Azure VMs using NSGs
- Create and configure secure network rules
- Control traffic access to cloud resources
- Apply best practices for Azure virtual networking

## 📚 Credits

This project is based on a guided exercise originally published on GitHub. I completed and documented it as part of my cybersecurity portfolio.
