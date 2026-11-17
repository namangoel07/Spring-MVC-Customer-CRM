# Spring MVC Customer Relationship Management System

A web-based Customer Relationship Management (CRM) application developed using Java, Spring MVC, Spring Data JPA, Hibernate, MySQL, and JSP.

The application allows users to manage customer records through a simple web interface, supporting essential CRUD (Create, Read, Update, Delete) operations.

## 🚀 Features

- **Customer Registration:** Add new customers with their first name, last name, and city.
- **View Customers:** Display all registered customers in a structured table.
- **Update Customer:** Modify existing customer information.
- **Delete Customer:** Remove customer records from the database.
- **Database Integration:** Persist customer information using MySQL and Hibernate ORM.
- **MVC Architecture:** Separation of application logic into Model, View, and Controller layers.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Programming Language |
| Spring MVC | Web Application Framework |
| Spring Data JPA | Database Operations |
| Hibernate | ORM Framework |
| MySQL | Relational Database |
| JSP | View Layer |
| JSTL | Dynamic Content Rendering |
| HTML5 | Frontend Structure |
| CSS3 | Styling |
| Maven | Dependency Management |
| Apache Tomcat | Application Server |

## 📂 Project Structure

```text
SpringCRMWebApp/
│
├── src/main/java/com/telusko/
│   │
│   ├── model/
│   │   └── Customer.java
│   │
│   ├── repo/
│   │   └── ICustomerRepo.java
│   │
│   ├── service/
│   │   ├── ICustomerService.java
│   │   └── CustomerService.java
│   │
│   ├── web/
│   │   └── CustomerController.java
│   │
│   └── SpringCrmWebAppApplication.java
│
├── src/main/resources/
│   └── application.properties
│
├── src/main/webapp/
│   ├── view/
│   │   ├── customerinfo.jsp
│   │   ├── showform.jsp
│   │   └── updateform.jsp
│   │
│   └── style.css
│
├── pom.xml
└── README.md
```

## ⚙️ Application Architecture

The application follows the Model-View-Controller (MVC) architecture.

**1. Model Layer**
- `Customer.java` represents the customer entity.
- Uses JPA annotations for database mapping.

**2. Repository Layer**
- `ICustomerRepo.java` extends `CrudRepository`.
- Provides built-in database operations.

**3. Service Layer**
- `ICustomerService.java` defines business operations.
- `CustomerService.java` implements customer management logic.

**4. Controller Layer**
- `CustomerController.java` handles HTTP requests.
- Connects the service layer with JSP views using Spring MVC.

**5. View Layer**
- JSP pages display customer information and registration/update forms.
- JSTL is used to dynamically display customer records.

## 🗄️ Database Configuration

The application uses MySQL.

Create a database:

```sql
CREATE DATABASE springmvc;
```

Configure the following environment variables:

```text
DB_URL=jdbc:mysql://localhost:3306/springmvc
DB_USERNAME=root
DB_PASSWORD=your_mysql_password
```

Configure your `application.properties` accordingly.

## ▶️ How to Run

**Prerequisites**
- Java JDK
- Apache Maven
- MySQL Server
- Eclipse IDE (optional)

**Steps**

1. Clone the repository:

```bash
git clone https://github.com/YOUR_USERNAME/Spring-MVC-Customer-CRM.git
```

2. Navigate to the project directory:

```bash
cd Spring-MVC-Customer-CRM
```

3. Configure the MySQL database and environment variables.

4. Run the application:

```bash
mvn spring-boot:run
```

5. Open your browser:

```text
http://localhost:8082/CRMApp/cxinfo
```

## 📌 Learning Outcomes

Through this project, I gained practical experience with:

- Spring MVC request handling.
- Dependency Injection using `@Autowired`.
- Spring Data JPA and repository interfaces.
- Hibernate ORM and entity mapping.
- JSP and JSTL integration.
- MySQL database connectivity.
- Implementing CRUD operations.
- Understanding layered application architecture.

## 👨‍💻 Author

**Naman Goel**

B.Tech – Computer Science and Engineering (Data Science)

[GitHub](https://github.com/YOUR_USERNAME)
