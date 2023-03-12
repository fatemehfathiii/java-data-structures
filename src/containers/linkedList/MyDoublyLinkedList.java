package containers.linkedList;

import containers.List;

public class MyDoublyLinkedList<E> extends MyLinkedList<E> implements List<E> {

    public void addFirst(E value) {
        var newNode = new Node<>(value);
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
        var newNode = new Node<>(value);
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
    public void removeByIndex(int index) {

        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        super.removeByIndex(index);
    }

    public void reverse() {
        if (isEmpty()) return;
        if (size == 1) return;

        Node<E> prevNode = first;
        var selectedNode = first.next;

        while (selectedNode != null) {
            var nextNode = selectedNode.next;

            selectedNode.next = prevNode;
            prevNode = selectedNode;
            selectedNode = nextNode;
        }
        last = first;
        last.next = null;

        first = prevNode;
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
        super.remove(element);
    }


    @Override
    public void print() {
        System.out.println(this);
    }


}
