LinkedIn Web Automation – Selenium Java Framework
📌 Project Overview

This project is a Selenium Web Automation Framework built using Java, designed to automate key functionalities of the LinkedIn web application such as Login, Home page validation, and negative scenarios.
The framework follows industry best practices like Page Object Model (POM), Data-Driven Testing, and TestNG for test execution.

🎯 Objectives

Automate critical LinkedIn workflows

Validate both positive and negative login scenarios

Build a scalable and maintainable automation framework

Demonstrate real-world Selenium project structure for interviews

🛠️ Tech Stack Used

Language: Java

Automation Tool: Selenium WebDriver

Test Framework: TestNG

Build Tool: Maven

Design Pattern: Page Object Model (POM)

Data Driven: Apache POI (Excel)

Browser Management: WebDriverManager

IDE: IntelliJ IDEA / Eclipse

📂 Project Structure
LinkedInAutomation/
│
├── src/main/java
│   ├── base        → Browser setup & teardown
│   ├── pages       → Page Object classes
│   └── utils       → Excel & utility helpers
│
├── src/test/java
│   └── tests       → TestNG test classes
│
├── testdata
│   └── LoginData.xlsx
│
├── pom.xml
└── README.md

🔑 Features Covered

✅ Login with valid credentials

❌ Login with invalid credentials

🔐 Error message validation

📊 Data-driven testing using Excel

🧩 Page Object Model implementation

⚡ Explicit waits for synchronization

🧪 TestNG assertions & reports

🧪 Test Scenarios Implemented

Login with valid email and password

Login with invalid email

Login with invalid password

Login with empty credentials

Validation of error messages

Successful login verification using profile icon

▶️ How to Run the Project
1️⃣ Prerequisites

Java JDK 8 or above

Maven installed

Chrome browser

IDE (IntelliJ / Eclipse)

2️⃣ Clone Repository
git clone https://github.com/your-username/LinkedInAutomation.git

3️⃣ Run Tests
mvn test

📊 Test Data

Test data is maintained in Excel file:

testdata/LoginData.xlsx

Email	Password
valid@email.com
	rohit123
invalid@email.com
	rohin123
🧠 Framework Design Highlights

Page Object Model → Better maintainability

Reusable components → Reduced code duplication

Explicit waits → Stable execution

Data-Driven approach → Easy scalability

TestNG → Parallel execution & reporting ready

📌 Interview-Ready Explanation

“I built a Selenium automation framework using Java and TestNG for LinkedIn web application. I automated login functionality using Page Object Model and executed multiple scenarios through Excel-based data-driven testing. The framework is scalable, maintainable, and aligned with real-time industry standards.”

🚧 Future Enhancements

Profile update automation

Feed post & like automation

Job search automation

Cross-browser testing

Jenkins CI/CD integration

Extent Reports integration

👤 Author

Rohit Kumar
📧 Email: rohitsdr8299@gmail.com

🔗 LinkedIn: (https://www.linkedin.com/in/rohit-kumar82/)
