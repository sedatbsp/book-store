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

#### Make Admin
````
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey123!
````

#### Save Book
````
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
Content-Type: application/json
Content-Length: 155

{
    "title":"Tehlikeli Oyunlar",
    "price":50,
    "description":"Tehlikeli Oyunlar, Oğuz Atay'ın ikinci romanıdır.",
    "author":"Oğuz Atay"

}
````

#### Delete Book
````
DELETE /api/book/6 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
````

#### Get All Books
````
GET /api/book HTTP/1.1
Host: localhost:8080
````

#### Save Purchase
````
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin
Content-Type: application/json
Content-Length: 54

{
    "userId":5,
    "bookId":6,
    "price":50
}
````

#### Get User Purchases
````
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin
````

<br>
