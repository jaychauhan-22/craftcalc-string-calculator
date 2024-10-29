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
    void test_02_twoNumbers() {
        // Given
        Calc calc = new Calc();

        // When
        int result = calc.add("1,2");

        // Then
        Assertions.assertEquals(3, result);
    }

    @Test
    void test_02_multiNumbers() {
        // Given
        Calc calc = new Calc();

        // When
        int result = calc.add("1,2,3,10,32,43");

        // Then
        Assertions.assertEquals(91, result);
    }

}