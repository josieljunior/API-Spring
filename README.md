# API-Spring
### Aplicação para um fórum

Nesse repositório estou criando uma API baseado no curso da alura, com o objetivo de testar meus conhecimentos.

## Ferramentas utilizadas:
- Spring Boot
- Spring Data JPA
- H2
- Spring Security
- Spring Validation
- Token JWT
- Spring Boot Actuator
- Spring Boot Admin
- Spring Cache
- Swagger
- SpringFox
- Spring Boot Test
- JUnit
- Docker

## Executar aplicação
Primeiro é necessário criar a imagem do projeto:

```
docker build -t api-test-spring .
```
\
Em seguida criar o container com as configurações necessárias:
```
docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE='PROD' -e FORUM_DATABASE_URL='jdbc:h2:mem:forum' -e FORUM_DATABASE_USERNAME='SA' -e FORUM_DATABASE_PASSWORD='' -e FORUM_JWT_SECRET='aquivaiachave' api-test-spring
```
