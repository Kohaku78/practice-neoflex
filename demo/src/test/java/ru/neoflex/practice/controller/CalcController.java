package ru.neoflex.practice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Калькулятор", description = "API для базовых арифметических операций")
public class CalcController {

    @Operation(summary = "Сложение двух чисел", description = "Возвращает сумму двух чисел")
    @GetMapping("/plus/{a}/{b}")
    public Integer plus(
            @Parameter(description = "Первое число") @PathVariable("a") Integer a,
            @Parameter(description = "Второе число") @PathVariable("b") Integer b) {
        return a + b;
    }

    @Operation(summary = "Вычитание двух чисел", description = "Возвращает разность двух чисел")
    @GetMapping("/minus/{a}/{b}")
    public Integer minus(
            @Parameter(description = "Первое число") @PathVariable("a") Integer a,
            @Parameter(description = "Второе число") @PathVariable("b") Integer b) {
        return a - b;
    }
}