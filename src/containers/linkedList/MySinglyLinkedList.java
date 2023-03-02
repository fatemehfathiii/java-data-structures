package containers.linkedList;

import containers.List;

import java.util.NoSuchElementException;

public class MySinglyLinkedList<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public void addFirst(E value) {
        var newNode = new Node<>(value);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
        size++;
    }

    public void addLast(E value) {
        var newNode = new Node<>(value);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    @Override
    public void add(E element) {
        addFirst(element);
    }


    public void deleteFirst() {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;
        var next = first.getNext();
        first.setNext(null);
        first = next;
        size--;

    }

    public void deleteLast() {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;

            var prevLastNode = first;
            while (prevLastNode.getNext() != last) {
                prevLastNode = prevLastNode.getNext();
            }
            prevLastNode.setNext(null);
            last = prevLastNode;
            size--;
    }

    @Override
    public void remove(E element) {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;

        var requestedNode = first;
        var prevRequestedNode = first;

        for (int i = 0; i < size; i++) {

            if (requestedNode.getValue().equals(element)) {
                prevRequestedNode.setNext(requestedNode.getNext());
                requestedNode.setNext(null);
                break;
            }
            prevRequestedNode = requestedNode;
            requestedNode = requestedNode.getNext();
        }
        size--;
    }

    @Override
    public void removeByIndex(int index) {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;
        var step = 0;
        var requestedNode = first;
        var prevRequestedNode = first;

        while (step != index) {
            prevRequestedNode = requestedNode;
            requestedNode = requestedNode.getNext();
        }

        prevRequestedNode.setNext(requestedNode.getNext());
        size--;
    }

    @Override
    public int indexOf(E element) {
        if (isEmpty()) throw new NoSuchElementException("list is empty!");
        var requestedNode = first;
        for (int step = 0; step < size; step++) {

            if (requestedNode.getValue().equals(element)) {
                return step;
            }
            requestedNode = requestedNode.getNext();
        }
        return -1;
    }

    @Override
    public E get(int index) {
        if (isEmpty()) throw new NoSuchElementException("list is empty!");
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        var step = 0;
        var requestedNode = first;

        while (step != index) {
            requestedNode = requestedNode.getNext();
            step++;
        }
        return requestedNode.getValue();
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) > -1;
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
        if (first == last) return "[%s]".formatted(first.getValue());

        var stringBuilder = new StringBuilder("[");
        for (var node = first; node != null; node = node.getNext()) {
            stringBuilder.append(node.getValue());
            if (node != last) stringBuilder.append(",");
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public Object[] toArray() {
        var array = new Object[size];
        var index = 0;
        for (var node = first; node.getNext() != null; node = node.getNext()) {
            array[index++] = node;
        }
        return array;
    }


    //helping method for check empty list and delete single node lists
    private int checkEmptyListAndDeleteSingleNode() {
        if (isEmpty()) throw new NoSuchElementException("list is empty!");

        if (first == last) {
            first = last = null;
            size--;
            return 1;
        }
        return 0;
    }

    //helping method for check if list is empty or not
    private boolean isEmpty() {
        return size == 0;
    }
}
