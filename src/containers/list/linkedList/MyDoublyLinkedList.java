package containers.list.linkedList;

import containers.list.List;

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
    public void revers(){
        if (isEmpty()) return;
        if (first==last) return;

        Node<E> temp;
        var current = first;

        while (current != null){

            temp = current.next;

            current.next =current.prev;
            current.prev = temp;

            current = current.prev;
        }

        temp = first;
        first = last;
        last = temp;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
