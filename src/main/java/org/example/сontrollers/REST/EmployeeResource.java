//package org.example.сontrollers;
//
//import org.example.models.Employee;
//import org.example.services.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///*
//Инверсия управления (Inversion of Control, IoC) в контексте паттерна MVC (Model-View-Controller)
//В Spring MVC, контроллеры играют роль компонентов, которые обрабатывают входящие HTTP-запросы от клиента.
//Вместо того, чтобы явно создавать экземпляры контроллеров, мы можем использовать функциональности IoC фреймворка Spring для их инстанцирования
//и внедрения зависимостей.
//
//В приведенном примере контроллер EmployeeResource зависит от сервиса EmployeeService, который обеспечивает бизнес-логику для работы с пользователями.
//С помощью аннотации @Autowired и конструктора контроллера, мы внедряем зависимость EmployeeService в контроллер.
//
//При обработке HTTP-запросов, контейнер Spring MVC автоматически создает экземпляры контроллеров и устанавливает им правильные зависимости.
//Например, при получении запроса GET /employee, контейнер создаст экземпляр EmployeeResource и передаст ему экземпляр EmployeeService,
//необходимый для обработки запроса.
//
//Таким образом, принцип инверсии управления (IoC) в Spring MVC позволяет сосредоточиться на разработке бизнес-логики контроллеров,
//а не на их создании и управлении зависимостями. Фреймворк берет на себя задачу создания экземпляров и внедрения зависимостей,
//что делает код более модульным, тестируемым и поддерживаемым.
//
// */
//
///*
//Контроллеры в Spring MVC используются для обработки HTTP-запросов от клиента и возвращения соответствующего HTTP-ответа.
//Они являются посредниками между клиентом и бизнес-логикой приложения.
//
//Главная цель контроллеров - обработка входящих запросов и управление процессом обработки запроса.
//Они принимают запросы, извлекают необходимые параметры или данные из запроса, вызывают соответствующие сервисы или компоненты для выполнения бизнес-логики,
//и формируют ответ, который будет отправлен клиенту.
//
// */
//
//
//@RestController
//@RequestMapping("/employee")
//public class EmployeeResource {
//    private final EmployeeService employeeService;
//
//    @Autowired
//    public EmployeeResource(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<List<Employee>> getAllEmployees () {
//        List<Employee> employees = employeeService.findAllEmployees();
//        return new ResponseEntity<>(employees, HttpStatus.OK);
//    }
//
//    @GetMapping("/find/{id}")
//    public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") Long id) {
//        Employee employee = employeeService.findEmployeeById(id);
//        return new ResponseEntity<>(employee, HttpStatus.OK);
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
//        Employee newEmployee = employeeService.addEmployee(employee);
//        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
//        Employee updateEmployee = employeeService.updateEmployee(employee);
//        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
//        employeeService.deleteEmployee(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}