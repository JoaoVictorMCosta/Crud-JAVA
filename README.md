
# 📚 CRUD JAVA com Spring Boot, PostgreSQL e Flyway

## 🇧🇷 Descrição (Português)

Este projeto é um CRUD simples desenvolvido em **Java**, utilizando **Spring Boot**, **PostgreSQL** e **Flyway** para versionamento do banco de dados. Ele permite criar, listar, atualizar e deletar registros, sendo uma ótima base para projetos RESTful em Java.

### 🚀 Tecnologias utilizadas
- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL (NeonDB)
- Flyway (migrações de banco)
- Maven

### ⚙️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/JoaoVictorMCosta/Crud-JAVA.git
   cd Crud-JAVA
   ```

2. Configure o arquivo `src/main/resources/application.properties` com os dados do seu banco PostgreSQL (local ou NeonDB).

3. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse: `http://localhost:8080`

### 🗃️ Estrutura do projeto
- `src/main/java` – Código-fonte do projeto
- `src/main/resources/db/migration` – Scripts Flyway para criação das tabelas
- `src/main/resources/application.properties` – Configurações da aplicação

---

## 🇺🇸 Description (English)

This project is a simple CRUD built with **Java**, using **Spring Boot**, **PostgreSQL**, and **Flyway** for database versioning. It supports creating, listing, updating, and deleting records – a great boilerplate for Java RESTful APIs.

### 🚀 Technologies used
- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL (NeonDB)
- Flyway
- Maven

### ⚙️ How to run

1. Clone the repository:
   ```bash
   git clone https://github.com/JoaoVictorMCosta/Crud-JAVA.git
   cd Crud-JAVA
   ```

2. Edit the `src/main/resources/application.properties` with your PostgreSQL connection data.

3. Run the project:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Open: `http://localhost:8080`

### 🗃️ Project structure
- `src/main/java` – Source code
- `src/main/resources/db/migration` – Flyway migration scripts
- `src/main/resources/application.properties` – Application configuration

---

## 📫 Contato / Contact

**João Victor Moreira da Costa**  
[LinkedIn](https://www.linkedin.com/in/joaovictordamcosta)  
📧 contato.joaovictormcosta@gmail..com
