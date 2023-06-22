//package org.example.services.withInterface;
//
//import org.example.exceptions.UserNotFoundException;
//import org.example.models.User;
//import org.example.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///*
//Внедрение зависимостей (Dependency Injection, DI) является важной частью архитектуры MVC (Model-View-Controller) веб-приложений.
//DI позволяет осуществлять разделение ответственности между компонентами и упрощает их тестирование и поддержку.
//
//В контексте MVC, внедрение зависимостей осуществляется путем предоставления необходимых зависимостей компонентам (например, контроллерам или сервисам),
//вместо того, чтобы они явно создавали или наследовались от зависимостей.
//
//@Controller
//@RequestMapping("/users")
//public class UserController {
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    // Методы обработки HTTP-запросов
//
////Получение списка всех пользователей:
//    @GetMapping("/users")
//public ResponseEntity<List<User>> getAllUsers() {
//    List<User> users = userService.getAllUsers();
//    return ResponseEntity.ok(users);
//}
//
////Получение пользователя по идентификатору:
//@GetMapping("/users/{id}")
//public ResponseEntity<User> getUserById(@PathVariable Long id) {
//    User user = userService.getUserById(id);
//    return ResponseEntity.ok(user);
//}
//
////Создание нового пользователя:
//@PostMapping("/users")
//public ResponseEntity<User> addUser(@RequestBody User user) {
//    userService.addUser(user);
//    return ResponseEntity.status(HttpStatus.CREATED).body(user);
//}
//
////Обновление существующего пользователя:
//@PutMapping("/users/{id}")
//public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
//    User existingUser = userService.getUserById(id);
//    // Обновление полей существующего пользователя на основе данных из запроса
//    existingUser.setName(user.getName());
//    existingUser.setEmail(user.getEmail());
//    userService.updateUser(existingUser);
//    return ResponseEntity.ok(existingUser);
//}
//
////Удаление пользователя:
//@DeleteMapping("/users/{id}")
//public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
//    userService.deleteUser(id);
//    return ResponseEntity.noContent().build();
//}
//
//}
//
//В данном примере зависимость UserService внедряется в UserController через конструктор.
//Аннотация @Autowired указывает Spring контейнеру автоматически провести внедрение зависимости при создании экземпляра контроллера.
//
//В результате, контроллер получает готовую реализацию сервиса и может использовать его методы для обработки запросов от клиента.
//
//Использование внедрения зависимостей позволяет создавать модульные компоненты, которые легко тестируются и поддерживаются.
//Кроме того, DI позволяет легко заменять или модифицировать зависимости без необходимости изменения кода компонентов,
//что способствует гибкости и расширяемости приложения.
//
//
// */
//
//@Service
//public class UserServiceImpl implements UserService {
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public User getUserById(Long id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> new UserNotFoundException("User not found"));
//    }
//
//    public void addUser(User user) {
//        userRepository.save(user);
//    }
//
//    public void updateUser(User user) {
//        userRepository.save(user);
//    }
//
//    public void deleteUser(Long id) {
//        userRepository.deleteById(id);
//    }
//}
