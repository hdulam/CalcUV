package stack;

/**
 * Uso: Stack genérico.
 * @param <T> tipo de dato almacenado
 */
public interface Stack<T> {

    /**
     * Inserta un elemento en la pila.
     * @pre item != null
     * @post size() aumenta en 1
     */
    void push(T item);

    /**
     * Remueve y retorna el elemento superior.
     * @pre la pila no está vacía
     * @post size() disminuye en 1
     */
    T pop();

    /**
     * Retorna el elemento superior sin removerlo.
     * @pre la pila no está vacía
     */
    T peek();

    boolean isEmpty();
    int size();
}
