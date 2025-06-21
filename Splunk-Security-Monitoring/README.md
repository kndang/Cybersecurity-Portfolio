# 🔍 Splunk Security Monitoring Lab

## 🧠 Overview

This lab demonstrates how to use Splunk to monitor system logs, detect suspicious activity, and build basic dashboards for threat hunting. It’s a hands-on project aimed at showcasing skills in log ingestion, search processing (SPL), and incident investigation using Splunk.

## 🛠 Lab Setup Instructions

- **Splunk Enterprise** (Free Trial)
- **Windows 10 VM** (or local Windows machine)
- **Sample Logs** from:
    
## 🧪 Lab Exercises

### Exercise 1: Splunk Installation

- Installed Splunk Enterprise on a local machine.
- Accessed the dashboard via `http://localhost:8000`.
- Created admin account and completed setup.

### Exercise 2: Ingesting Data

- Indexed Windows Security logs using Splunk Universal Forwarder.

### Exercise 3: Detecting Suspicious Events

Ran several SPL queries to detect security events:

**🔐 Failed Login Attempts**
```spl
index=* sourcetype=WinEventLog:Security EventCode=4625
| stats count by Account_Name, host, _time
```

**👤 New User Account Creation**
```spl
index=* sourcetype=WinEventLog:Security EventCode=4720
```

### Exercise 4: Dashboards
- Built a dashboard with:
  - Top failed login accounts
  - Login failure trend over time

## 🧠 What I Learned
- How to ingest and search logs in Splunk
- Basic detection techniques using SPL
- Laying the foundations for SIEM-based threat hunting
