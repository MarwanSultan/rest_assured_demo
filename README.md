# REST Assured API Testing Framework

## Overview
This project demonstrates **API automation testing** using **REST Assured**. It provides a structured framework for validating RESTful web services with **JUnit** and **TestNG**, supporting functionalities such as request validation, response assertion, and parameterized testing.

## Features
- **Automated API testing** using REST Assured
- **Request and response validation** (status codes, headers, and body)
- **Data-driven testing** with parameterized inputs
- **Support for authentication mechanisms** (Basic, OAuth, JWT, etc.)
- **Logging and reporting** using TestNG and Extent Reports
- **Maven-based dependency management**

## Technologies & Tools Used
- **Programming Language**: Java
- **API Testing Framework**: REST Assured
- **Testing Framework**: TestNG / JUnit
- **Build Tool**: Maven
- **Logging & Reporting**: Log4j, TestNG Reports, Extent Reports

## Project Structure
```
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── utilities       # Helper classes for API requests and validations
│   ├── test
│   │   ├── java
│   │   │   ├── testCases       # API test scripts
│   │   │   ├── base            # Base test setup and configurations
├── testng.xml                   # TestNG configuration for execution
├── pom.xml                      # Maven dependencies and project setup
├── README.md                     # Documentation
```

## Installation & Setup
### Prerequisites
- Java 8 or later installed
- Maven installed
- REST Assured dependencies (handled via Maven)

### Steps to Set Up the Project
1. **Clone the repository:**
   ```sh
   git clone https://github.com/MarwanSultan/rest_assured_demo.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd rest_assured_demo
   ```
3. **Install dependencies:**
   ```sh
   mvn clean install
   ```
4. **Run API tests using Maven:**
   ```sh
   mvn test
   ```

## How to Use
- Modify API endpoints and test data in the `testCases` package.
- Define authentication details and headers in the `base` package.
- Execute test cases via TestNG XML or Maven commands.

## Sample Test Case
Example of a simple GET request test:
```java
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAPITest {
    @Test
    public void testGetRequest() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
```

## Reporting
To generate a TestNG report after execution:
```sh
mvn surefire-report:report
```

## Contributing
- Fork the repository
- Create a feature branch (`feature-branch-name`)
- Commit your changes and push them
- Create a Pull Request

## License
This project is licensed under the **MIT License**.

## Author
**Marwan Sultan**  
LinkedIn: [Your LinkedIn Profile](https://www.linkedin.com/in/marwansultan/)  
Email: marwan.sultan@gmail.com  

---

This README provides detailed documentation for your REST Assured testing framework. Let me know if you need modifications! 🚀
