# 🔍 Splunk Security Monitoring Lab

## 🧠 Overview

This lab demonstrates how to use Splunk to monitor system logs, detect suspicious activity, and build basic dashboards for threat hunting. It’s a hands-on project aimed at showcasing skills in log ingestion, search processing (SPL), and incident investigation using Splunk.

## 🛠 Lab Setup Instructions

- **Splunk Enterprise** (Free Trial)
- **Windows 10 VM** (or local Windows machine)
- **Splunk Universal Forwarder** for collecting logs
- Enabled **Windows Security Auditing**
    
## 🧪 Lab Exercises

### Exercise 1: Splunk Installation

- Installed Splunk Enterprise on a local machine.
- Accessed the dashboard via `http://localhost:8000`.
- Created admin account and completed setup.

### Exercise 2: Ingesting Data

- Installed and configured **Splunk Universal Forwarder**.
- Configured it to forward:
  - `WinEventLog:Security`
  - `WinEventLog:System`
  - `WinEventLog:Application`
- Verified indexing by checking incoming security events.
  
### Exercise 3: Detecting Suspicious Events

Ran several SPL queries to detect security events:

**🔐 Failed Login Attempts**
```spl
index=* sourcetype=WinEventLog:Security EventCode=4625
| stats count by Account_Name, host, _time
```
Shows which users have the highest number of failed login attempts using EventCode 4625. Helps detect brute-force or credential stuffing attempts.

**👤 New User Account Creation**
```spl
index=* sourcetype=WinEventLog:Security EventCode=4720
```

Tracks when new user accounts are created in the system. This helps detect unauthorized account creations or insider activity that could indicate a security breach.

**⚙️ Recent Process Creations Events**
```spl
index=* source="WinEventLog:Security" EventCode=4688
| rex field=_raw "New Process Name:\s+(?<Image>.+)"
| rex field=_raw "Process Command Line:\s+(?<CommandLine>.+)"
| table _time, Image, CommandLine
| sort -_time
```

Displays a live view of recent process creation activity using Windows EventCode 4688. This panel helps identify unexpected or unauthorized software executions.

**🧨 Suspicious Process Execution (from unusual folders)**
```spl
index=* source="WinEventLog:Security" EventCode=4688
| rex field=_raw "New Process Name:\s+(?<Image>.+)"
| rex field=_raw "Process Command Line:\s+(?<CommandLine>.+)"
| where like(Image, "%\\AppData\\%") OR like(Image, "%\\Temp\\%") OR like(Image, "%\\Downloads\\%") OR like(Image, "%\\ProgramData\\%") OR like(Image, "%\\Public\\%")
| table _time, Image, CommandLine
| sort -_time
```

Highlights process execution from non-standard folders like AppData, Temp, Downloads, ProgramData, or Public. These are commonly abused by malware or attackers.

### Exercise 4: Dashboards
- Built a dashboard with:
  - Top failed login accounts
  - Login failure trend over time
  - Recent Process Creations Events
  - Suspcious Process Executions from Unusual Locations

## 🧠 What I Learned
- How to ingest and search logs in Splunk
- Basic detection techniques using SPL
- Build informative dashboards for SOC visibility
