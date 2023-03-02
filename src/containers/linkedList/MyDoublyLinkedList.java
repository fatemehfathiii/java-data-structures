package containers.linkedList;

import containers.List;

import java.util.NoSuchElementException;

public class MyDoublyLinkedList<E> implements List<E> {

    private DNode<E> first;
    private DNode<E> last;
    private int size;


    public void addFirst(E value) {
        var newNode = new DNode<>(value);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            first.prev = newNode;
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void addLast(E value) {
        var newNode = new DNode<>(value);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
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
        var second = first.next;
        second.prev = null;
        first.next = null;
        first = second;
        size--;
    }

    public void deleteLast() {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;
        var prevLastNode = last.prev;
        prevLastNode.next = null;
        last.prev = null;
        last = prevLastNode;
        size--;
    }

    @Override
    public void remove(E element) {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;

        if (first.value == element) {
            deleteFirst();
            return;
        }

        if (last.value == element) {
            deleteLast();
            return;
        }

        var requested = first.next;
        var prevRequested = first;
        while (requested != last) {

            if (requested.value == element) {
                prevRequested.next = requested.next;
                requested.next.prev = prevRequested;
                requested.next = null;
                requested.prev = null;
                size--;
                return;
            }

            prevRequested = requested;
            requested = requested.next;
        }

    }

    @Override
    public void removeByIndex(int index) {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;
        var step = 0;
        var requested = first.next;
        var prevRequested = first;

        while (step != index) {
            prevRequested = requested;
            requested = requested.next;
            step++;
        }

        prevRequested.next = requested.next;
        requested.next.prev = prevRequested;
        requested.next = null;
        requested.prev = null;
        size--;

        size--;
    }

    @Override
    public int indexOf(E element) {
        if (isEmpty()) throw new NoSuchElementException("list is empty!");
        var requestedNode = first;
        for (int step = 0; step < size; step++) {

            if (element == requestedNode.value) {
                return step;
            }
            requestedNode = requestedNode.next;
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
            requestedNode = requestedNode.next;
            step++;
        }
        return requestedNode.value;
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
        if (first == last) return "[%s]".formatted(first.value);

        var stringBuilder = new StringBuilder("[");
        for (var node = first; node != null; node = node.next) {
            stringBuilder.append(node.value);
            if (node != last) stringBuilder.append(",");
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public Object[] toArray() {
        var array = new Object[size];
        var index = 0;
        for (var node = first; node.next != null; node = node.next) {
            array[index++] = node;
        }
        return array;
    }

    private boolean isEmpty() {
        return size == 0;
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

    //inner class for node
    private static class DNode<E> {
        DNode<E> prev;
        E value;
        DNode<E> next;

        public DNode(E value) {
            this.prev = null;
            this.value = value;
            this.next = null;
        }
    }
}
