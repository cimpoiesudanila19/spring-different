package org.example.repositories;

import org.example.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Использование spring-boot-starter-data-rest позволяет обойтись без Service и Controller

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

}
//
////        GET /users: Получение всех сущностей User.
////        POST /users: Создание новой сущности User.
////        GET /users/{id}: Получение сущности User по указанному идентификатору.
////        PUT /users/{id}: Обновление сущности User с указанным идентификатором.
////        DELETE /users/{id}: Удаление сущности User с указанным идентификатором.
//
//
//
