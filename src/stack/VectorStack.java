package stack;

import java.util.Vector;

/**
 * Crear Stack usando Vector dinámico.
 */
public class VectorStack<T> implements Stack<T> {

    private Vector<T> data;

    public VectorStack() {
        data = new Vector<>();
    }

    @Override
    public void push(T item) {
        data.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data.remove(data.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data.lastElement();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }
}
