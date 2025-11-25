# Spring Boot Calculator Microservice

Простое микросервисное приложение калькулятора на Spring Boot.

## Функциональность

- **Сложение**: GET `/plus/{a}/{b}`
- **Вычитание**: GET `/minus/{a}/{b}`

## Технологии

- Java 17
- Spring Boot 3.5.7
- Maven

## Запуск приложения

```bash`

mvn spring-boot:run

## Swagger документация

После запуска приложения документация API доступна по адресу:
http://localhost:8080/swagger-ui/index.html

![Swagger Interface](demo/Calculator-swagger.png)
![Swagger Interface](demo/Plus-swagger.png)
![Swagger Interface](demo/Minus-swagger.png)
