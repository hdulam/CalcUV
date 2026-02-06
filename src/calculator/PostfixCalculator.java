package calculator;

/**
 * ADT para una calculadora de expresiones postfix.
 */
public interface PostfixCalculator {

    /**
     * Evalúa una expresión en notación postfix.
     *
     * @param expression expresión postfix válida separada por espacios
     * @return resultado entero de la expresión
     *
     * @throws ArithmeticException si ocurre división entre cero
     * @throws IllegalArgumentException si el operador no es válido
     * @throws IllegalStateException si la expresión postfix es inválida
     *
     * @pre expression != null
     * @post la pila queda vacía
     */
    int evaluate(String expression);
}
