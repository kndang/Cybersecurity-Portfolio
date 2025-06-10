# 🔐☁️ Securing Data in AWS S3 Buckets

This project walks through the process of launching and securing an Amazon EC2 instance. It covers key areas like setting up security groups, managing SSH access with key pairs, hardening the instance, and configuring basic monitoring with CloudWatch.

## 🎯 Overview

This project walks through securing an Amazon S3 bucket, a widely used cloud storage service. It covers the core steps for protecting stored data: creating a private bucket, enabling versioning, applying server-side encryption, managing access through policies, and configuring logging for audit purposes.

## 🔧 Tools & Skills
  - Platform: AWS S3
  - Security Features: Bucket policies, encryption (KMS), access logging
  - Skills: IAM permissions, cloud storage hardening, CLI basics

## 🧪 Exercises

### Exercise 1: Create a Secure S3 Bucket

- Created a bucket
- Enabled the “Block all public access” option to prevent unauthorized access

### Exercise 2: Enable Bucket Versioning

- Enabled versioning under the bucket’s Properties tab

### Exercise 3: Enable Server-Side Encryption (SSE-KMS)

- Enabled default encryption using AWS Key Management Service (KMS)
- Selected an AWS-managed KMS key

### Exercise 4: Set a Bucket Policy

- Added a policy to allow read-only access to a specific IAM user

### Exercise 5: Enable Access Logging

- Turned on server access logging
- Set my-log-bucket as the target for log storage

## 🧠 What I Learned

- How to configure core AWS S3 security settings
- The role of encryption, access control, and logging in data protection
- How versioning supports data recovery and auditing
- Real-world use of IAM and bucket policies for secure access

## 📚 Credits

This project is based on a guided exercise originally published on GitHub. I completed and documented it as part of my cybersecurity portfolio.
