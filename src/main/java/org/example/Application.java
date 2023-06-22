package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

/*
@SpringBootApplication: Это аннотация, которая объединяет несколько других аннотаций, таких как @Configuration, @EnableAutoConfiguration и @ComponentScan.
Она указывает, что класс является конфигурационным классом Spring Boot и автоматически включает настройку и сканирование компонентов.

public static void main(String[] args): Это метод main, который является точкой входа в приложение. Он запускает приложение Spring Boot.

SpringApplication.run(Application.class, args): Это статический метод run класса SpringApplication, который запускает приложение Spring Boot.
Он принимает два аргумента: класс, который содержит конфигурацию приложения (в данном случае, Application.class), и аргументы командной строки (args).

 */