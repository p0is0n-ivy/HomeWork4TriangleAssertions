package AreaTriangleTest;

import AreaTriangle.AreaTriangleFunction;
import AreaTriangle.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


public class AreaTriangleTest {

    @Test
    @DisplayName("Позитивный тест")
    void positivTestAreaTriangleFunction() throws MyException {
        Assertions.assertEquals(AreaTriangleFunction.calcAreaTriangle(6, 4, 7), 11.98);
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 4, 2.90", "4, 4, 4, 6.93", "5, 5, 5, 10.83", "6, 8, 10, 24", "3000, 3222, 1000,1496968.24"})
    @DisplayName("Позитивные проверки: 1) обычный треугольник, 2) равносторонний 3)равнобедренный 4) прямоугольный 5) с большими значениями сторон")
    void positivTestAreaTriangleFunction2(double a, double b, double c, double result) throws MyException {
        Assertions.assertEquals(AreaTriangleFunction.calcAreaTriangle(a, b, c), result);
    }


    @Test
    @DisplayName("Праверка правильности округления")
    void roundingTestAreaTriangleFunction() throws MyException {
        Assertions.assertEquals(11.97, AreaTriangleFunction.calcAreaTriangle(6, 4, 7), 0.01);
    }


    @ParameterizedTest
    @CsvSource({"-2, 3, 3", "3, 4, 8", "3, 4, 0", "4, 4, 8"})
    @DisplayName("Негативные проверки: 1) сторона с отрицательным значением, 2) сумма двух сторон < третьей, 3) сторона равна 0, 4) сумма двух сторон равна третьей")
    void negativTestAreaTriangleFunction(double a, double b, double c) throws MyException {
        Assertions.assertThrows(Exception.class, () -> AreaTriangleFunction.calcAreaTriangle(a, b, c));
    }
}
