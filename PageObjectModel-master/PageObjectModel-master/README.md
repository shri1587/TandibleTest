# Page Object model Test automation framework using Selenium with Java, TestNG and Maven-
This project to demonstrate the POM test automation with page factory for few test cases in Tendable website.
TestNG is used as test framework.

Dependency
Java
Maven

###libraries used
Selenium
TestNG
log4j


### Page Object Model with Page Factory insight and why to use it
Page Object Model (POM) Framework with Page Factory
Introduction
The Page Object Model (POM) is a design pattern widely used in test automation. It creates an Object Repository for web UI elements, reducing code duplication and improving test maintenance. In POM, each web page corresponds to a Page Class, which identifies the WebElements on that page and contains methods to perform operations on those elements.

Page Factory is an extension of POM that simplifies interaction with web elements by providing a dedicated class.

Why Use POM?
Code Separation: POM separates UI operations from verification, making code cleaner and more understandable.
Reusable Object Repository: The object repository is independent of test cases, allowing reuse across different tools (e.g., TestNG, JUnit, JBehave, Cucumber).
Optimized Code: Reusable page methods in POM classes lead to less code duplication.
Realistic Method Names: Methods are named based on UI operations (e.g., gotoHomePage()).
How to Implement POM?
1. Basic POM Structure
   In the basic POM framework:

Maintain all web elements and methods that operate on them inside a class file.
Separate verification tasks as part of test methods.
2. Page Factory
   Page Factory simplifies POM by providing a dedicated class. It allows you to:

Instantiate Page objects.
Initialize Page class elements without using FindElement/s.
Example Project Structure
Here’s how you can structure your POM framework:

src/main/java:
pages: Create a separate class for each web page (e.g., LoginPage, HomePage).
utilities: Utility classes for common functions (e.g., browser setup, logging).
src/test/java:
tests: Test classes that use Page Objects.
testdata: Test data (e.g., credentials, URLs).
src/test/resources:
config: Configuration files (e.g., browser properties, timeouts).


### Steps to clone execute the tests
```
git clone 
cd PageObjectModel
mvn clean test
```
