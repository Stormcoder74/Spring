package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.domain.Person;
import ru.otus.spring.service.PersonService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");

        PersonService personService = (PersonService) context.getBean("personService");

        // Получите Person "Ivan"
        Person ivan = personService.getByName("Иван");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}
