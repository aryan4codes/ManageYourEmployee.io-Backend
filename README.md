
# ManageYourEmployee.io-Backend

Welcome to the ManageYourEmployee.io Backend! This Spring Boot application provides backend functionality for managing employee data.

## Prerequisites

Ensure you have the following installed on your system:

- Java 11 or higher
- Maven
- Docker (optional, for Docker-based deployment)

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/aryan4codes/ManageYourEmployee.io-Backend.git
```

### 2. Change into the Project Directory

```bash
cd ManageYourEmployee.io-Backend
```

### 3. Build the Project Using Maven

```bash
mvn clean package
```

### 4. Run the Project Using Maven

```bash
mvn spring-boot:run
```

### Alternative: Run the Project Using Docker

If you prefer to use Docker, follow these steps:

1. **Build the Docker Image**

   ```bash
   docker build -t manage-your-employee-backend .
   ```

2. **Run the Docker Container**

   ```bash
   docker run -p 8080:8080 manage-your-employee-backend
   ```

## Project Structure

- `src`: Source code for the project
- `.gitignore`: Files and directories to ignore in the Git repository
- `Dockerfile`: Dockerfile for building a Docker image
- `pom.xml`: Maven configuration file

## Notes

- Replace `manage-your-employee-backend` with your desired Docker image name if needed.

Feel free to open issues or submit pull requests if you have any suggestions or improvements!
