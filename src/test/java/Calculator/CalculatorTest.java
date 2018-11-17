package Calculator;

import Tests.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }
    
    @ParameterizedTest
    @MethodSource ("substractionNumberProvider")
    void testParametrizedSubstraction (Integer first, Integer second, Integer result) {
        Integer substractResult = calculator.substract(first,second);
        assertEquals(substractResult,result);
        assertNotNull(substractResult);
    }
    
    static Stream<Arguments> substractionNumberProvider(){
        return Stream.of(
                Arguments.arguments(3,2,1),
                Arguments.arguments(84,4,80),
                Arguments.arguments(9,9,0)
        );
    }
    

    @ParameterizedTest
    @MethodSource ("addNumberProvider")
    void testParametrizedAdd(Integer first, Integer second, Integer result) {
        Integer addResult = calculator.add(first, second);
        assertEquals(addResult,result);
        assertNotNull(addResult);

    }

    static Stream<Arguments> addNumberProvider() {
        return Stream.of(
                Arguments.arguments(1,2,3),
                Arguments.arguments(3,5,8)
        );
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
