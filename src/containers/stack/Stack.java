package containers.stack;

public interface Stack<E> {
    void push(E element);
    Object pop();
    Object peek();
    boolean isEmpty();
    int size();
    void print();

}
