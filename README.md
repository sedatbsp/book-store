# Book Store - Spring Boot

### Prerequisites
- [Java](https://dev.java/learn/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Gradle](https://docs.gradle.org/current/userguide/building_java_projects.html)
- [PostgreSQL](https://www.postgresql.org/docs/)
- [Lombok](https://projectlombok.org/setup/gradle)

### Tools
- IntelliJ IDEA or any preferred IDE with embedded Gradle
- Postman (or any RESTful API testing tool)

### Run the Application

Clone the source codes into your local system.

```
git clone https://github.com/sedatbsp/book-store
```

Then, to run the application, run the following command in a terminal window (in the ``` complete ```) directory:

```
./gradlew bootRun
```
>  it will run application as spring boot application

or
> run main method from `BookStoreApplication.java` as spring boot application.


## API Endpoints

#### Sign Up

````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "name":"Sedat Başpınar",
    "username":"sedatbsp",
    "password":"123456"
}
````

#### Sign In

````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username":"sedatbsp",
    "password":"123456"
}
````

<br>
<br>