package containers.linkedList;

import containers.List;

import java.util.NoSuchElementException;

public class MySinglyLinkedList<E> extends MyList<E>implements List<E> {

    public void addFirst(E value) {
        var newNode = new Node<>(value);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void addLast(E value) {
        var newNode = new Node<>(value);
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

        if (first.value.equals(element)) {
            deleteFirst();
            return;
        }

        if (last.value.equals(element)) {
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
        if (isEmpty()) throw new NoSuchElementException("list is empty!");
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
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
    public void print() {
        System.out.println(this);
    }

}
