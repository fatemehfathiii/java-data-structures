package containers.linkedList;

import containers.List;

import java.util.NoSuchElementException;

public class MySinglyLinkedList<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;

    private int size;


    //this method adds node to the front of the list
    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
        size++;
    }


    //this methode adds node to end of the list
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    //this method remove a node that user wants
    @Override
    public void remove(E element) {
        if (isEmpty()) throw new NoSuchElementException("list is empty");

        if (first == last) {
            deleteFirst();
        }

        var requestedNode = first;
        var prevRequestedNode = first;

        while (!requestedNode.contain(element)) {

            //why do we use return ?
            if (requestedNode.getNext() == null) return;

            prevRequestedNode = requestedNode;
            requestedNode = requestedNode.getNext();
        }

        prevRequestedNode.setNext(requestedNode.getNext());
        size--;
    }

    //this method remove node based on their index
    @Override
    public void removeByIndex(int index) {

        if (isEmpty()) throw new NoSuchElementException("list is empty");

        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        if (first == last) {
            deleteFirst();
            return;
        }

        var counter = 0;
        var requestedNode = first;
        var prevRequestedNode = first;

        while (index != counter) {

            if (requestedNode.getNext() == null) return;

            prevRequestedNode = requestedNode;
            requestedNode = requestedNode.getNext();
            counter++;
        }

        prevRequestedNode.setNext(prevRequestedNode.getNext());
        size--;

    }

    //this method remove node from the front of the list
    public void deleteFirst() {
        if (isEmpty()) throw new NoSuchElementException("list is empty");

        if (first == last) {
            first = last = null;
            size--;
            return;
        }

        first.setNext(null);
        first = first.getNext();
    }

    //this method remove node from the end of the list
    public void deleteLast() {
        if (isEmpty()) throw new NoSuchElementException("list is empty");

        if (first == last) {
            first = last = null;
            size--;
            return;
        }

        var beforeLastNode = first;

        for (; beforeLastNode != null; beforeLastNode = beforeLastNode.getNext()) {
            if (beforeLastNode.getNext() == last) break;
        }

        assert beforeLastNode != null;
        last = beforeLastNode;
        beforeLastNode.setNext(null);
        size--;
    }

    @Override
    public int indexOf(E element) {
        var index = 0;
        for (var node = first; node.getNext() != null; node = node.getNext()) {

            if (node.contain(element)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public E get(int index) {

        if (isEmpty()) throw new NoSuchElementException("list is empty");
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        var counter = 0;
        var node = first;
        for (; counter != index; node = node.getNext()) {
            counter++;
        }
        return node.getData();
    }

    public void reverse() {
        if (isEmpty()) throw new NoSuchElementException("list is empty");
        if (first == last) return;

        var backNode = first;
        var frontNode = first.getNext();

        while (frontNode.getNext() != null ){
            var nextFrontNode=frontNode.getNext();

            backNode=frontNode;

        }


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
        if (first == last) return "[%s]".formatted(first.getData());

        var stringBuilder = new StringBuilder("[");
        for (var node = first; node!= null; node = node.getNext()) {
            stringBuilder.append(node.getData());
            if (node != last) stringBuilder.append(",");
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public Object[] toArray() {
        var array = new Object[size];
        int index = 0;
        for (var node = first; node != null; node = node.getNext()) {
            array[index++] = node.getData();
        }
        return array;
    }

    //helping method for check if list is empty or not
    private boolean isEmpty() {
        return size == 0;
    }
}
