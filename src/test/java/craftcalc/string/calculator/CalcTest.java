package craftcalc.string.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcTest {
    @Test
    void test_01_blank() {
        // Given
        Calc calc = new Calc();

        // When
        int result = calc.add("");

        // Then
        Assertions.assertEquals(0, result);
    }

    @Test
    void test_02_singleNumber() {
        // Given
        Calc calc = new Calc();

        // When
        int result = calc.add("1");

        // Then
        Assertions.assertEquals(1, result);
    }

    @Test
    void test_03_twoNumbers() {
        // Given
        Calc calc = new Calc();

        // When
        int result = calc.add("1,2");

        // Then
        Assertions.assertEquals(3, result);
    }

    @Test
    void test_04_multiNumbers() {
        // Given
        Calc calc = new Calc();

        // When
        int result = calc.add("1,2,3,10,32,43");

        // Then
        Assertions.assertEquals(91, result);
    }

    @Test
    void test_05_newLine() {
        // Given
        Calc calc = new Calc();

        // When
        int result = calc.add("1\\n2,3");

        // Then
        Assertions.assertEquals(6, result);
    }

    @Test
    void test_06_negativeNumber() {
        // Given
        Calc calc = new Calc();
        // int result = calc.add("-1,20,-3,4,-5,-7");
        // Then
        Assertions.assertThrows(NegativeNumberException.class, () -> calc.add("-1,-2"));
    }

    @Test
    void test_07_changeDelimeter() {
        // Given
        Calc calc = new Calc();
         int result = calc.add("//[***]\\n1***2***3");
        // Then
        Assertions.assertEquals(6, result);
    }


}