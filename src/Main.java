import calculator.PostfixCalculator;
import calculator.PostfixCalculatorImpl;
import stack.Stack;
import stack.VectorStack;

import java.io.BufferedReader;
import java.io.FileReader;


public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new VectorStack<>();
        PostfixCalculator calculator = new PostfixCalculatorImpl(stack);

        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int result = calculator.evaluate(line);
                System.out.println("Resultado: " + result);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
