package containers.linkedList;

import containers.List;

public class MyCircularLinkedList<E> extends MyLinkedList<E> implements List<E> {

    @Override
    public void add(E element) {
        var newNode = new Node<>(element);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            first.prev = newNode;
            newNode.next = first;
            first = newNode;
            last.next = newNode;
        }
        size++;
    }

    public void deleteFirst() {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;
        var second = first.next;
        second.prev = null;
        first.next = null;
        first = second;
        last.next = first;
        size--;
    }

    public void deleteLast() {
        if (checkEmptyListAndDeleteSingleNode() == 1) return;
        var prevLastNode = last.prev;
        prevLastNode.next = null;
        last.prev = null;
        last = prevLastNode;
        last.next = first;
        size--;
    }


    @Override
    public void remove(E element) {
        if (checkEmptyListAndDeleteSingleNode() == 0) return;

        if (first.value.equals(element)) {
            deleteFirst();
            return;
        }

        if (last.value.equals(element)) {
            deleteLast();
            return;
        }
        super.remove(element);
    }

//    public void reverse() {
//
//        if (isEmpty()) return;
//        if (size == 1) return;
//
//        Node<E> prevNode = first;
//        var selectedNode = first.next;
//
//        for (int i = 0; i < size; i++) {
//            var nextNode = selectedNode.next;
//
//            selectedNode.next = prevNode;
//            prevNode = selectedNode;
//            selectedNode = nextNode;
//        }
//
//        last = first;
//        last.next=first;
//        first.prev=first;
//    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        super.toString();
        var stringBuilder = new StringBuilder("[");

        for (var node = first; node.next != first; node = node.next) {
            stringBuilder.append(node.value);

            stringBuilder.append(",");
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public Object[] toArray() {
        var array = new Object[size];
        var index = 0;
        for (var node = first; node.next != first; node = node.next) {
            array[index++] = node;
        }
        return array;
    }

}
