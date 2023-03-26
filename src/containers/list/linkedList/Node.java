package containers.list.linkedList;

public class Node <E>{
    Node<E> prev;
    E value;
    Node<E> next;

    public Node(E value) {
        this.prev = null;
        this.value = value;
        this.next = null;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
