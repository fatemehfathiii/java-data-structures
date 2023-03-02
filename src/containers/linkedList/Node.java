package containers.linkedList;

public class Node<E> {

    private final E value;
    private Node<E> next;

    public Node(E data) {
        this.value = data;
        this.next = null;
    }

    public E getValue() {
        return value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    //helping method for checking the equality of data
    public boolean contain(E element) {
        return element == this.value;
    }
}
