package containers.queue;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {
    private final Object[] ELEMENTS;
    private int head;
    private int tail;
    private final static int Max_CAPACITY = 100;
    private int size;

    public ArrayQueue() {
        this.ELEMENTS = new Object[Max_CAPACITY];
        this.head = -1;
        this.tail = -1;
    }


    @Override
    public void add(E element) {
        if (size == ELEMENTS.length) {
            System.out.println("the queue is full!");
            return;
        }
        ELEMENTS[++tail] = element;
        if (head == -1) head++;
        size++;
    }

    @Override
    public Object poll() {
        if (size == 0) {
            return "the queue is empty!";
        }
        var selected = ELEMENTS[head];

        for (int i = 0; i < size; i++) {
            ELEMENTS[i] = ELEMENTS[i + 1];
        }
        tail--;
        size--;
        return selected;
    }

    @Override
    public Object peek() {

        if (size == 0) {
            return "the queue is empty!";
        }
        return ELEMENTS[head];
    }

    @Override
    public Object getLast() {
        return ELEMENTS[tail];
    }

    @Override
    public int size() {
        return size;
    }

    public int capacity() {
        return Max_CAPACITY - size;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        var arrayString = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            arrayString.append(ELEMENTS[i]);
            if (i < size - 1) {
                arrayString.append(",");
            }
        }
        arrayString.append("]");
        System.out.println(arrayString);
        return arrayString.toString();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}