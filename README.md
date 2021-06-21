# Maven -  Java web application project and Selenium Test
Maven 3, Spring 5 MVC, JUnit 5, Logback and Jetty web server. A simple web project to perform Selenium Test and Junit.



## 1. How to run this project?

### 1.1 Test it with Jetty web server.
```
$ git clone https://github.com/mkyong/maven-examples.git
$ cd java-web-project 
$ mvn jetty:run
```
Access http://localhost:8080/Login.jsp


### 1.2 Create a WAR file for deployment :
```
$ git clone https://github.com/mkyong/maven-examples.git
$ cd java-web-project 
$ mvn package or mvn war:war
```
A WAR is generated at 'target/finalName'
## 2. How to Test it?
### 2.1 Junit Test
```
$ git clone https://github.com/mkyong/maven-examples.git
$ cd java-web-project 
$ mvn test
```
### 2.2 Selenium Test
```
Goto src\test\java\com\tm\web\test\TestWelcomeSelenium.java
Run as Java Application
or 
execute
mvn -Dtest=TestWelcome#testUserValidateSelenium test

```
Report will be available in target/surefire-reports

## SonarQube Test
	
	do git repository
	excute sonar-scanner

## Synk Test

 <Identify the scanning technique>
