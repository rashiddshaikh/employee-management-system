# 👨‍💼 Employee Management System  
A complete CRUD application built using **Java**, **Spring Boot**, **Hibernate (JPA)**, and **RESTful APIs**.

---

## 🚀 Features

- ✅ Create, Read, Update, Delete Employees
- 🔄 RESTful API Endpoints
- 🗄️ Hibernate ORM (No SQL Queries Needed)
- 🧱 DTO Pattern for clean data transfer
- 🛡️ Input Validation & Custom Error Messages
- 🎯 Global Exception Handling
- 🔍 Search, Filter & Active Employee Listing
- 🧰 Uses **H2 Database** for Testing (MySQL ready)

---

## 🗄️ Database

### Default: **H2 In-Memory** (Easy Testing)
Access console after running app: http://localhost:8080/h2-console

---

### Switch to MySQL (For Production)
Just uncomment in `application.properties` and add your credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
---

📡 REST API Endpoints

| Method | Endpoint                             | Description              |
| ------ | ------------------------------------ | ------------------------ |
| GET    | `/api/employees`                     | Get all employees        |
| GET    | `/api/employees/{id}`                | Get employee by ID       |
| POST   | `/api/employees`                     | Create new employee      |
| PUT    | `/api/employees/{id}`                | Update employee          |
| DELETE | `/api/employees/{id}`                | Delete employee          |
| GET    | `/api/employees/department/{dept}`   | Filter by department     |
| GET    | `/api/employees/active`              | Get all active employees |
| GET    | `/api/employees/search?keyword=john` | Search employee by name  |

---

📝 Sample JSON Request (POST / PUT)
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@company.com",
  "phoneNumber": "+1234567890",
  "hireDate": "2024-01-15",
  "department": "IT",
  "position": "Software Engineer",
  "salary": 75000,
  "isActive": true
}
```

---

✅ Quick Test via H2

Run project
Open browser: http://localhost:8080/h2-console
Login
Create employees via API
Refresh H2 to see records

---

![GitHub Repo stars](https://img.shields.io/github/stars/rashiddshaikh/employee-management-system)
![GitHub forks](https://img.shields.io/github/forks/rashiddshaikh/employee-management-system)
![GitHub issues](https://img.shields.io/github/issues/rashiddshaikh/employee-management-system)
![GitHub last commit](https://img.shields.io/github/last-commit/rashiddshaikh/employee-management-system)

---
## 📄 License  
This project is licensed under the MIT License.

---

## ✍️ Author  
**Rashid Shaikh**  
🔗 GitHub: [@rashiddshaikh](https://github.com/rashiddshaikh)  
🔗 LinkedIn: [https://linkedin.com/in/rashidshaikh-dev](https://linkedin.com/in/rashidshaikh-dev)  
📧 Email: [rashidshaikh.dev@gmail.com](mailto:rashidshaikh.dev@gmail.com)

---
## 🌟 Contributing  
Pull requests are welcome!  
For major changes, please [open an issue first](https://github.com/rashiddshaikh/employee-management-system/issues).

---
## 🙏 Acknowledgments
Thanks to the Spring Boot, Hibernate, H2 Database, and the Open Source Community ❤️ for making development easier and learning better.
