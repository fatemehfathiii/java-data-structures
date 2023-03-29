package containers.queue;

import containers.list.linkedList.Node;

public class LinkedQueue<E> implements Queue<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public void add(E element) {
        var newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
        size++;
    }

    @Override
    public Object poll() {
        if (size == 0) {
            return "the queue is empty!";
        }
        if (head == tail) {
            var temp = head;
            head = tail = null;
            size--;
            return temp.getValue();
        }

        var temp = head;
        var second = head.getNext();
        head.setNext(null);
        second.setPrev(null);
        head = second;
        size--;
        return temp.getValue();
    }

    @Override
    public Object peek() {
        return head.getValue();
    }

    @Override
    public Object getLast() {
        return tail.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        if (head == tail) return "[%s]".formatted(head.getValue());

        var stringBuilder = new StringBuilder("[");
        var node = head;
        for (int i = 0; i < size; i++) {

            stringBuilder.append(node.getValue());

            if (node != tail) stringBuilder.append(",");
            node = node.getNext();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
