package containers.linkedList;

import java.util.NoSuchElementException;

public abstract class MyLinkedList<E> extends MyList<E> {

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
        if (isEmpty()) throw new NoSuchElementException("list is empty!");
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        var step = 0;
        var requested = first;
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
    }

}
