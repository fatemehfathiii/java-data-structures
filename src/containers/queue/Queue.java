package containers.queue;

public interface Queue<E> {
    void add(E element);
    Object poll();
    Object peek();
    Object getLast();
    int size();
    void print();
    boolean isEmpty();
}
