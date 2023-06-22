//package org.example.services;
//
//import jakarta.transaction.Transactional;
//import org.example.exceptions.EmployeeNotFoundException;
//import org.example.models.Employee;
//import org.example.repositories.EmployeeJpaRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///*
//EmployeeService представляет собой сервисный компонент, отвечающий за бизнес-логику связанную с сущностью "Employee" (сотрудник).
//В рамках этого сервиса можно выполнять операции, такие как добавление нового сотрудника, поиск сотрудников, обновление информации о сотруднике,
//удаление сотрудника и т.д.
//
//В общей архитектуре приложения сервисы часто выступают в качестве промежуточного слоя между контроллерами (отвечающими за обработку HTTP-запросов)
//и репозиториями (отвечающими за доступ к базе данных). Сервисы инкапсулируют бизнес-логику и предоставляют удобный интерфейс для контроллеров,
//позволяя им вызывать нужные операции.
//
// */
//
//@Service
//@Transactional
//public class EmployeeService {
//    private final EmployeeJpaRepository employeeJpaRepository;
//
//    @Autowired
//    public EmployeeService(EmployeeJpaRepository employeeJpaRepository) {
//        this.employeeJpaRepository = employeeJpaRepository;
//    }
//
//    public Employee addEmployee(Employee employee) {
//        return employeeJpaRepository.save(employee);
//    }
//
//    public List<Employee> findAllEmployees() {
//        return employeeJpaRepository.findAll();
//    }
//
//    public Employee updateEmployee(Employee employee) {
//        return employeeJpaRepository.save(employee);
//    }
//
//    public Employee findEmployeeById(Long id) {
//        return employeeJpaRepository.findEmployeeById(id)
//                .orElseThrow(() -> new EmployeeNotFoundException("User by id " + id + " was not found"));
//    }
//
//    public void deleteEmployee(Long id) {
//        employeeJpaRepository.deleteEmployeeById(id);
//    }
//}
