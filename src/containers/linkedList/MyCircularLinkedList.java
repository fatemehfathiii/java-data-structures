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
            last.next = first;
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

        if (checkEmptyListAndDeleteSingleNode() == 1) return;

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

    public void print() {
        System.out.println(this);
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



}
