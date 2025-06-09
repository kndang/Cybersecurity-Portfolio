# ☁️🔒 Securing AWS EC2 Instances 

This project walks through the process of launching and securing an Amazon EC2 instance. It covers key areas like setting up security groups, managing SSH access with key pairs, hardening the instance, and configuring basic monitoring with CloudWatch.

## 🎯 Objective

- Launch an EC2 instance using Amazon Linux 2 AMI
- Set up secure SSH access with key pairs
- Apply system updates and limit root access
- Configure AWS security groups as a basic firewall
- Set up monitoring with Amazon CloudWatch

## 👣 Project Steps

### 1. Launch an EC2 Instance

- Choose Amazon Linux 2 AMI
- Use `t2.micro` (free tier eligible)
- Set up a new security group allowing SSH (port 22) **only from your IP**
- Generate and download a new key pair for SSH access

### 2. Connect via SSH
  - Open your terminal.
  - Navigate to the directory where your key pair is stored.
  - Change the permissions of your key pair file:
    ```bash
    chmod 400 your-key-pair.pem
    ```
  - Connect to your instance using the public DNS:
    ```bash
    ssh -i "your-key-pair.pem" ec2-user@your-instance-public-dns
    ```

### 3. Secure the Instance

- update system package and install security updates:
```bash
sudo yum update -y && sudo yum upgrade -y
```

- Add new user and grant sudo access:
```bash
sudo adduser newuser
sudo usermod -aG wheel newuser
```

- Harden SSH settings:
  - Disable root login
  - Disble password authentication
  - Restart the SSH service

### 4. Configure a Basic Firewall
  - Limit SSH to your IP address only
  - Remove any open or unnessary inbound rules

### 5. Set up CloudWatch Monitoring
  - Create a CloudWatch alarm for high CPU usage (e.g., CPU utilization > 80% for 5 minutes).
  - Configure it to send notification

## 📘 What I Learned
- How to securely configure an EC2 instance from launch to production-readiness
- Practical use of IAM, key pair management, security groups, and SSH hardening
- Basics of cloud monitoring and alerting in AWS

## 📚 Credits

This project is based on a guided exercise originally published on GitHub. I completed and documented it as part of my cybersecurity portfolio.
