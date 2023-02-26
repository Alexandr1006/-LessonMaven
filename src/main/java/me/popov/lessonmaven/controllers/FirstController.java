package me.popov.lessonmaven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String helloWorld() {
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String page() {
        return "имя ученика: Александр Попов " + " название вашего проекта: Maven  "  + " дата создания проекта: 26.02.2023 " + "Описание: Научились работать со спринг";
    }
}
