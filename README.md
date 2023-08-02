# Java com Springboot 3 e JPA/Hibernate

![Static Badge](https://img.shields.io/badge/license-MIT)(https://github.com/wagnerchc/workshop-springboot3-jpa/blob/main/LICENSE)

Projeto do curso de Java com Spring Boot 3 e JPA / Hibernate

# Sobre o projeto

Aplicação backend em Java utilizando Springboot 3 e JPA / Hibernate / banco H2.

## Modelo conceitual

![Modelo Conceitual](https://drive.google.com/file/d/1wjWK_3o684jILx9TKRv7cSlfdgFVwla2/view)

# Tecnologias utilizadas

## Back end

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- PostgreSQL

# Como executar o projeto

## Back end

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/wagnerchc/workshop-springboot3-jpa.git

# executar o projeto
./mvnw spring-boot:run
```

## Endpoints da aplicação em ambiente local com Postman API Platform

<ul>
    <li>GET - Consultar lista de usuários cadastrados - http://localhost:8080/users</li>
    <li>POS - Cadastrar novo usuário - http://localhost:8080/users</li>
    <li>GET - Consultar um usuário - http://localhost:8080/users/{id}</li>
    <li>PUT - Atualizar um usuário - http://localhost:8080/users/{id}</li>
    <li>DELETE - Excluir um usuário - http://localhost:8080/users/{id}</li>
    <li>GET - Consultar lista de pedidos cadastrados - http://localhost:8080/orders</li>
    <li>GET - Consultar um pedido cadastrado - http://localhost:8080/orders/{id}</li>
    <li>GET - Consultar lista de categorias cadastradas - http://localhost:8080/categories</li>
    <li>GET - Consultar uma categoria cadastrada - http://localhost:8080/categories/{id}</li>
    <li>GET - Consultar lista de produto cadastrado - http://localhost:8080/products</li>
    <li>GET - Consultar um produto cadastrado - http://localhost:8080/products/{id}</li>
</ul>

# Autor

Wagner Pereira Chequeleiro

https://www.linkedin.com/in/wagnerpch/

## Contribuição e agradecimento

Projeto desenvolvido a partir das aulas do professor Nelio Alves, obtidas na plataforma de ensino Udemy, mais informações do curso <a href="https://www.udemy.com/course/java-curso-completo/" target="_blank">clique aqui<a>. Agradeço ao professor por proporcional acesso didático e organizado ao mundo do JAVA.
