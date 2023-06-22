//package org.example.сontrollers.REST;
//
//import org.example.models.User;
//import org.example.repositories.ManRepository;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//// Работает напрямую от UserRepository, не нуждается в UserService благодаря ManRepository
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//    private final ManRepository userRepository;
//
//    public UserController(ManRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    // Получение всех пользователей
//    @GetMapping
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    // Получение пользователя по ID
//    @GetMapping("/{id}")
//    public ResponseEntity<User> getUserById(@PathVariable Long id) {
//        Optional<User> user = userRepository.findById(id);
//        if (user.isPresent()) {
//            return ResponseEntity.ok(user.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    // Создание нового пользователя
//    @PostMapping
//    public User createUser(@RequestBody User user) {
//        return userRepository.save(user);
//    }
//
//    // Обновление информации о пользователе
//    @PutMapping("/{id}")
//    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
//        Optional<User> existingUser = userRepository.findById(id);
//        if (existingUser.isPresent()) {
//            user.setId(id);
//            return ResponseEntity.ok(userRepository.save(user));
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    // Удаление пользователя
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
//        Optional<User> user = userRepository.findById(id);
//        if (user.isPresent()) {
//            userRepository.deleteById(id);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//}
//
