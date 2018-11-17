package Calculator;

import Tests.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testAdding() {
        int result = calculator.add(3,5);

        assertEquals(8,result);
    }

    @Test
    void testSubstraction(){
        int result = calculator.substract(8,4);

        assertEquals(4,result);
    }

    @Test
    void testMiltiply(){
        int result = calculator.multiply(5,5);

        assertEquals(25,result);
    }

    @Test
    void testDivide(){
        double result = calculator.divide(8,4);

        assertEquals(2,result);
    }

}
