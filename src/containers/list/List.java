package containers.list;

import containers.list.linkedList.MyLinkedList;

public interface List<E> {
    void add(E element);
    void remove(E element);
    void removeByIndex(int index);
    int indexOf(E element);
    E get(int index);
    boolean contains(E element);
    int size();
    void print();
}
