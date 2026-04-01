# 🎬 Gerenciador de Filmes — API REST com Spring Boot

> API RESTful para cadastro e gerenciamento de filmes, atores e diretores, desenvolvida com Java e Spring Boot.

---

## 📌 Sobre o Projeto

O **Gerenciador de Filmes** é uma API REST construída com Spring Boot que permite realizar operações de CRUD completo sobre filmes, atores e diretores. O projeto aplica boas práticas de arquitetura em camadas, separando responsabilidades entre Controller, Service, Repository, Entities e DTOs.

---

## ✨ Funcionalidades

- ✅ Cadastro, listagem, atualização e remoção de filmes
- ✅ Gerenciamento de atores e diretores
- ✅ Conversão entre Entities e DTOs
- ✅ Banco de dados em memória com H2
- ✅ Console H2 acessível pelo navegador
- ✅ JPA/Hibernate com criação automática de tabelas

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia        | Versão / Descrição              |
|-------------------|---------------------------------|
| Java              | 17+                             |
| Spring Boot       | Framework principal             |
| Spring Data JPA   | Persistência de dados           |
| H2 Database       | Banco de dados em memória       |
| Hibernate         | ORM / dialeto H2                |
| Maven             | Gerenciador de dependências     |

---

## 🗂️ Estrutura do Projeto

```
src/
└── main/
    └── java/com/phcvfcorp/movies_management/
        ├── Controller/       # Endpoints da API
        ├── Dtos/             # Objetos de transferência de dados
        ├── Entities/         # Entidades JPA
        ├── Repository/       # Interfaces de acesso ao banco
        ├── Service/          # Regras de negócio
        └── MoviesManagementApplication.java
```

---

## ⚙️ Configuração

As configurações da aplicação ficam em `src/main/resources/application.properties`:

```properties
spring.application.name=movies-management

# Banco H2 em memória
spring.datasource.url=jdbc:h2:mem:testedb
spring.datasource.username=admin
spring.datasource.password=admin

# JPA / Hibernate
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

# Console H2 no navegador
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Log de SQL
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 🚀 Como Rodar o Projeto

### Pré-requisitos

- Java 17 ou superior
- Maven instalado (ou usar o Maven Wrapper incluso)

### Passo a passo

**1️⃣ Clone o repositório**
```bash
git clone https://github.com/pedrohcvf/api-biblioteca-filmes.git
cd api-biblioteca-filmes
```

**2️⃣ Execute a aplicação**

Com Maven Wrapper (sem precisar instalar o Maven):
```bash
./mvnw spring-boot:run
```

Ou com Maven instalado:
```bash
mvn spring-boot:run
```

**3️⃣ Acesse a API**

A API estará disponível em:
```
http://localhost:8080
```

**4️⃣ Acesse o Console H2 (banco de dados)**
```
http://localhost:8080/h2-console
```
> Use as credenciais definidas no `application.properties` para fazer login.

---

## 📡 Endpoints

| Método | Endpoint         | Descrição                    |
|--------|------------------|------------------------------|
| GET    | `/filmes`        | Lista todos os filmes        |
| GET    | `/filmes/{id}`   | Busca filme por ID           |
| POST   | `/filmes`        | Cadastra um novo filme       |
| PUT    | `/filmes/{id}`   | Atualiza um filme existente  |
| DELETE | `/filmes/{id}`   | Remove um filme              |

> Endpoints de atores e diretores seguem o mesmo padrão.

---

## 👨‍💻 Autor

**Pedro Carvalho**  
[![GitHub](https://img.shields.io/badge/GitHub-pedrohcvf-181717?style=flat&logo=github)](https://github.com/pedrohcvf)
