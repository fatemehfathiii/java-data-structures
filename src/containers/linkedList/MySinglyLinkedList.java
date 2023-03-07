package containers.linkedList;

import containers.List;

import java.util.NoSuchElementException;

public class MySinglyLinkedList<E> implements List<E> {

    private SNode<E> first;
    private SNode<E> last;
    private int size;

    public void addFirst(E value) {
        var newNode = new SNode<>(value);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void addLast(E value) {
        var newNode = new SNode<>(value);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
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
        var next = first.next;
        first.next = null;
        first = next;
        size--;

    }

    public void deleteLast() {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;

        var prevLastNode = first;
        while (prevLastNode.next != last) {
            prevLastNode = prevLastNode.next;
        }
        prevLastNode.next = null;
        last = prevLastNode;
        size--;
    }

    @Override
    public void remove(E element) {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;

        if (element == first.value) {
            deleteFirst();
            return;
        }

        if (element == last.value) {
            deleteLast();
            return;
        }

        var requestedNode = first;
        var prevRequestedNode = first;

        for (int i = 0; i < size; i++) {

            if (requestedNode.value.equals(element)) {
                prevRequestedNode.next = requestedNode.next;
                requestedNode.next = null;
                break;
            }
            prevRequestedNode = requestedNode;
            requestedNode = requestedNode.next;
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
            requestedNode = requestedNode.next;
            step++;
        }

        prevRequestedNode.next = requestedNode.next;
        size--;
    }

    @Override
    public int indexOf(E element) {
        if (isEmpty()) throw new NoSuchElementException("list is empty!");
        var requestedNode = first;
        for (int step = 0; step < size; step++) {

            if (requestedNode.value.equals(element)) {
                return step;
            }
            requestedNode = requestedNode.next;
        }
        return -1;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        var step = 0;
        var requestedNode = first;

        while (step != index) {
            requestedNode = requestedNode.next;
            step++;
        }
        return (E) requestedNode.value;
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

    private static class SNode<E> {
        private final E value;
        private SNode<E> next;

        public SNode(E data) {
            this.value = data;
            this.next = null;
        }
    }
}
