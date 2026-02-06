package calculator;

import stack.Stack;

/**
 * Implementación de la calculadora postfix.
 */
public class PostfixCalculatorImpl implements PostfixCalculator {

    private Stack<Integer> stack;

    public PostfixCalculatorImpl(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public int evaluate(String expression) {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                int result;
                switch (token) {
                    case "+" -> result = a + b;
                    case "-" -> result = a - b;
                    case "*" -> result = a * b;
                    case "/" -> {
                        if (b == 0) throw new ArithmeticException("Division by zero");
                        result = a / b;
                    }
                    default -> throw new IllegalArgumentException("Invalid operator");
                }
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalStateException("Invalid postfix expression");
        }

        return stack.pop();
    }
}
