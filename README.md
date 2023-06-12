# JavaCURD

```
# Spring Boot CRUD Project

This is a sample Java project built with the Spring Boot framework for performing CRUD (Create, Read, Update, Delete) operations on a database.

## Getting Started

To get started with this project, follow the steps below:

### Prerequisites

- Java Development Kit (JDK) 11 or higher installed
- Maven build tool installed
- MySQL

### Installation

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/iamakhildabral/JavaCURD.git
   ```

2. Navigate to the project directory:

   ```shell
   cd JavaCURD
   ```

3. Configure the database connection in the `application.properties` file. Update the following properties with your database credentials:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. Build the project using Maven:

   ```shell
   mvn clean install
   ```

5. Run the application:

   ```shell
   mvn spring-boot:run
   ```

6. The application will start running at `http://localhost:8080`.

## Usage

Once the application is running, you can use a tool like Postman or cURL to interact with the API endpoints. Here are the available endpoints:

- `GET /view`: Get all users
- `POST /add`: Create a new user
- `PUT /update/{id}`: Update an existing user
- `DELETE delete/{id}`: Delete a user

Make HTTP requests to the respective endpoints with the required data in the request body or as query parameters.

## Technologies Used

- Java
- Spring Boot
- MySQL
- Maven

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
```

Feel free to modify the content based on your specific project details and requirements.
