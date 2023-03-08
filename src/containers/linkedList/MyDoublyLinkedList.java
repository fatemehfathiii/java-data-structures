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
    public void add(E element) {
        addFirst(element);
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

}
