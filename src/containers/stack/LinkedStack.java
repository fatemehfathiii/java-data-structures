package containers.stack;

import containers.list.linkedList.Node;

public class LinkedStack<E> implements Stack<E> {
    private Node<E> first;
    private Node<E> top;
    private int size;

    @Override
    public void push(E element) {
        var newNode = new Node<>(element);

        if (size == 0) {
            first = top = newNode;
            size++;
            return;
        }

        top.setNext(newNode);
        newNode.setPrev(top);
        top = newNode;
        size++;
    }

    @Override
    public Object pop() {
        if (size == 0) {
            return "the queue is empty!";
        }

        if (top == first) {
            var temp = top;
            top = first = null;
            size--;
            return temp;
        }
        var temp = top.getValue();
        var prevTop = top.getPrev();
        top.setPrev(null);
        prevTop.setNext(null);
        top = prevTop;
        size--;
        return temp;
    }

    @Override
    public Object peek() {
        return top.getValue();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
        if (first == top) return "[%s]".formatted(first.getValue());

        var stringBuilder = new StringBuilder("[");
        var node = first;
        for (int i = 0; i < size; i++) {

            stringBuilder.append(node.getValue());

            if (node != top) stringBuilder.append(",");
            node = node.getNext();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
