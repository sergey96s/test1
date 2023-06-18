package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setUp(){
       System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach(){
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7, result, "Не тот ответ");

    }


    @Test
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7, result, "Не тот ответ");

    }
    @ParameterizedTest(name = "№{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName("Проверка суммирования 3")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @Tag("slozhenie")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals( expectedResult, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "№{index} - Разность {1} и {2}, ожидаем {2}")
    @DisplayName("Проверка вычитания")
    @CsvSource({"4, 3, 1", "-1, 2, -3", "0, 0, 0"})
    @Tag("vychitanie")
    void difference(int c, int d, int expectedResult1) {
        Calc calc = new Calc();
        int result1 = calc.difference(c, d);
        Assertions.assertEquals( expectedResult1, result1, "Не тот ответ");
    }
}