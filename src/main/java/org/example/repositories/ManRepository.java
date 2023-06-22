//package org.example.repositories;
//
//import org.example.models.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//// В данном случае можно обойтись без Service
//
//@Repository
//public interface ManRepository extends JpaRepository<User, Long> {
//    // Метод для сохранения (создания) нового пользователя
//    User save(User user);
//
//    // Метод для получения всех пользователей
//    List<User> findAll();
//
//    // Метод для получения пользователя по идентификатору
//    Optional<User> findById(Long id);
//
//    // Метод для обновления информации о пользователе
//    //User save(User user);
//
//    // Метод для удаления пользователя по идентификатору
//    void deleteById(Long id);
//
//}
