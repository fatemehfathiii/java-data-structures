package array;

public interface Array<T> {
    void add(T element);
    void remove(T element);
    void removeByIndex(int index);
    int indexOf(T element);
    boolean contains(T element);
    int size();
    void print();
}
