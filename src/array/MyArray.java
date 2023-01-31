package array;

import java.util.Arrays;

public class MyArray implements Array {

    private static final int DEFAULT_CAPACITY = 10;
    private int[] ELEMENTS;
    private int size = 0;

    //for initializing arrayList with default capacity(20)
    public MyArray() {
        this.ELEMENTS = new int[DEFAULT_CAPACITY];
    }


    //for initializing arrayList with custom capacity
    public MyArray(int customCapacity) {

        if (customCapacity > 0) {

            this.ELEMENTS = new int[customCapacity];

        } else {
            throw new IllegalArgumentException("Illegal capacity");
        }
    }

    @Override
    public void add(int element) {

        checkForAdd(size + 1);
        ELEMENTS[size++] = element;
    }

    @Override
    public void remove(int element) {

        var removedIndex = findIndex(element);
        shiftElement(removedIndex);
    }

    @Override
    public void removeByIndex(int index) {

        if (index < size && index > 0) {

            shiftElement(index);

        } else {

            throw new IndexOutOfBoundsException("""
                    index %d is out of range
                    """.formatted(index));
        }

    }

    @Override
    public int indexOf(int element) {
        return findIndex(element);
    }

    @Override
    public boolean contains(int element) {

        for (int i = 0; i < size; i++) {

            if (element == ELEMENTS[i]) {
               return true;
            }
        }
       return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {

        System.out.print("[");

        for (int i = 0; i < size; i++) {
            System.out.print(ELEMENTS[i] + ",");
        }
        System.out.println("]");
    }


    //helping method for checking the size of array
    private void checkForAdd(int mainCapacity) {
        if ((mainCapacity - ELEMENTS.length) > 0) {
            grow(mainCapacity);
        }

    }

    //helping method for increasing size of array
    private void grow(int mainCapacity) {

        var oldCapacity = ELEMENTS.length;
        var newCapacity = oldCapacity + (oldCapacity / 2);

        if (newCapacity - mainCapacity < 0) {
            newCapacity = mainCapacity;
        }

        int[] newArray = new int[newCapacity];

        for (int i = 0; i < size; i++) {

            newArray[i] = ELEMENTS[i];
        }

        ELEMENTS = newArray;
    }

    //helping method for shifting element when an element delete
    private void shiftElement(int index) {

        for (int i = index; i < (size - 1); i++) {
            ELEMENTS[i] = ELEMENTS[i + 1];
        }
        ELEMENTS[size-1] = 0 ;
        size--;
    }


    //helping method for find index of element
    private int findIndex(int element) {

        Integer removedIndex = null;

        for (int i = 0; i < size; i++) {

            if (element == ELEMENTS[i]) {
                removedIndex = i;
                break;
            }
        }

        if (!(removedIndex == null)) {

            return removedIndex;
        } else {

            throw new IllegalArgumentException(
                    """
                            value : %d not found
                            """.formatted(element)
            );
        }

    }
}
