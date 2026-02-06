package test;

import calculator.PostfixCalculatorImpl;
import stack.VectorStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void evaluateExpression() {
        PostfixCalculatorImpl calc =
                new PostfixCalculatorImpl(new VectorStack<>());
        assertEquals(15, calc.evaluate("1 2 + 4 * 3 +"));
    }
}
