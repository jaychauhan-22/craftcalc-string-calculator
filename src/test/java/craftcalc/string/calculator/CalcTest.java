package craftcalc.string.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalcTest {


    @Test
    // Sample Test 1
    void add() {
        Calc calc = new Calc();
        int result = calc.add("");
        Assertions.assertEquals(0, result);
    }
}