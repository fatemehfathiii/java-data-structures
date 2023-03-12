package containers.linkedList;

import java.util.NoSuchElementException;

public abstract class MyList<E> {

    Node<E> first;
    Node<E> last;
    int size;

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

    public boolean contains(E element) {
        return indexOf(element) > -1;
    }

    public int size() {
        return size;
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


    public E getKthFromTheEnd(int k) {
        if (isEmpty()) throw new IllegalArgumentException();

        var x = first;
        var y = first;
        for (int i = 0; i < k - 1; i++) {
            x = x.next;

            if (x == null) throw new IllegalArgumentException();
        }

        while (x != last) {
            y = y.next;
            x = x.next;
        }
        return y.getValue();
    }

    public String toString() {
        if (isEmpty()) return "[]";
        if (first == last) return "[%s]".formatted(first.value);

        var stringBuilder = new StringBuilder("[");
        var node = first;
        for (int i = 0; i < size; i++) {

            stringBuilder.append(node.value);

            if (node != last) stringBuilder.append(",");
            node = node.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public Object[] toArray() {
        var array = new Object[size];
        var node = first;
        for (int index = 0; index < size;) {
            array[index++] = node;
            node = node.next;
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
