# 🔐☁️ Securing Data in AWS S3 Buckets

This project walks through securing an Amazon S3 bucket, a widely used cloud storage service. It covers the core steps for protecting stored data: creating a private bucket, enabling versioning, applying server-side encryption, managing access through policies, and configuring logging for audit purposes.

## 🔧 Tools & Skills
  - Platform: AWS S3
  - Security Features: Bucket policies, encryption (KMS), access logging
  - Skills: IAM permissions, cloud storage hardening, CLI basics

## 🧪 Exercises

### Exercise 1: Create a Secure S3 Bucket

1. Log in to the [AWS Management Console](https://aws.amazon.com/console/).
2. Navigate to the S3 Dashboard.
3. Click on "Create bucket".
4. Configure the bucket settings:
    - Bucket name: `my-secure-bucket`
    - Region: Select a region
    - Block all public access: Enable
5. Click "Create bucket".

![Create Bucket](Images/createS3Bucket.png)
*Creating a S3 bucket.*

![Create Bucket 2](Images/createS3Bucket2.png)
*Blocking all public access.*

### Exercise 2: Enable Bucket Versioning

1. Navigate to the S3 Dashboard.
2. Select the bucket my-secure-bucket.
3. Click on "Properties".
4. Scroll down to "Bucket Versioning" and click "Edit".
5. Enable versioning and save changes.

![Bucket Versioning](Images/bucketVersioning.png)
*Bucket Versioning enabled.*

### Exercise 3: Enable Server-Side Encryption (SSE-KMS)

1. Navigate to the S3 Dashboard.
2. Select the bucket my-secure-bucket.
3. Click on "Properties".
4. Scroll down to "Default encryption" and click "Edit".
5. Enable server-side encryption with AWS-KMS.
6. Choose a KMS key or create a new one.
7. Save changes.

![Server-Side Encryption](Images/encryption.png)
*AWS-KMS encryption enabled.*

### Exercise 4: Set a Bucket Policy

1. Navigate to the S3 Dashboard.
2. Select the bucket `my-secure-bucket`.
3. Click on "Permissions".
4. Scroll down to "Bucket policy" and click "Edit".
5. Add the following policy to allow read access for a specific user:
    ```json
    {
      "Version": "2012-10-17",
      "Statement": [
        {
          "Effect": "Allow",
          "Principal": {
            "AWS": "arn:aws:iam::123456789012:user/username"
          },
          "Action": "s3:GetObject",
          "Resource": "arn:aws:s3:::my-secure-bucket/*"
        }
      ]
    }
    ```
6. Save changes.

![Bucket Policies](Images/bucketPolicies.png)
*Policy that allows a specific username to read any object from the S3 bucket.*

### Exercise 5: Enable Access Logging

1. Navigate to the S3 Dashboard.
2. Select the bucket `my-secure-bucket`.
3. Click on "Properties".
4. Scroll down to "Server access logging" and click "Edit".
5. Enable access logging and specify a target bucket for logs (e.g., `my-log-bucket`).
6. Save changes.

![S3 Logs](Images/s3Logs.png)
*Server access logging is enabled and the target bucket for logs is set.*

## 🧠 What I Learned

- How to configure core AWS S3 security settings
- The role of encryption, access control, and logging in data protection
- How versioning supports data recovery and auditing
- Real-world use of IAM and bucket policies for secure access

## 📚 Credits

This project is based on a guided exercise originally published on GitHub. I completed and documented it as part of my cybersecurity portfolio.
