package test;

import stack.VectorStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    void pushAndPop() {
        VectorStack<Integer> stack = new VectorStack<>();
        stack.push(5);
        assertEquals(5, stack.pop());
    }
}
