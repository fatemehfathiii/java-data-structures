package containers.linkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {

    Node<E> first;
    Node<E> last;
    int size;

    void remove(E element) {
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

    public boolean contains(E element) {
        return indexOf(element) > -1;
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.println(this);
    }

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

    boolean isEmpty() {
        return size == 0;
    }


    //helping method for check empty list and delete single node lists
    int checkEmptyListAndDeleteSingleNode() {
        if (isEmpty()) throw new NoSuchElementException("list is empty!");

        if (first == last) {
            first = last = null;
            size--;
            return 1;
        }
        return 0;
    }

}
