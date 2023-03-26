package containers.list.linkedList;

import containers.list.List;

import java.util.NoSuchElementException;

public abstract class MyList<E> implements List<E> {
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
        for (int index = 0; index < size; ) {
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

    public E kthFromTheEnd(int k) {
        if (isEmpty()) throw new IllegalStateException();

        var a = first;
        var b = first;

        for (int i = 0; i < k - 1; i++) {
            b = b.next;
        }

        if (b == null) throw new IllegalStateException();

        while (b != last){
            a=a.next;
            b=b.next;
        }

        return a.value;
    }

    public abstract void revers();
}
