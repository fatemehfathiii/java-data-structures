package containers.stack;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int top;

    public ArrayStack() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.top = -1;
    }

    public ArrayStack(int capacity) {
        this.elements = new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(E element) {
        if (top == (elements.length - 1)) grow();
        elements[++top] = element;
    }

    @Override
    public Object pop() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
        var topElement = elements[top];
        elements[top] = null;
        top--;
        return topElement;
    }

    @Override
    public Object peek() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
        return elements[top];
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);

            if (i != top){
               sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void grow() {
        var newCapacity = elements.length + elements.length / 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
