# Social Network API

API REST desenvolvida em Java com Spring Boot e MongoDB, simulando funcionalidades básicas de uma rede social, como usuários, posts e comentários.

O projeto foi desenvolvido com foco em aprendizado de:
- modelagem de dados NoSQL
- APIs REST
- relacionamento entre documentos
- arquitetura em camadas
- Spring Data MongoDB

---

# Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data MongoDB
- Maven
- MongoDB
- REST API

---

# Funcionalidades

- Cadastro de usuários
- Busca de usuários
- Atualização de usuários
- Exclusão de usuários
- Criação de posts
- Comentários em posts
- Relacionamento entre usuários e posts
- Relacionamento entre posts e comentários
- Busca de posts por título
- Busca de posts por intervalo de datas
- Busca de posts por palavras-chave no título, conteúdo e comentários

---

# Estrutura do projeto

O projeto segue arquitetura em camadas:

```text
src/main/java
├── config
├── domain
├── dto
├── repository
├── resources
│   ├── exception
│   └── util
└── services