package array;


import java.util.Arrays;
import java.util.Objects;

public class MyArray<T> implements Array<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] ELEMENTS;
    private int size;

    //for initializing arrayList with default capacity(20)
    public MyArray() {
        this.ELEMENTS = new Object[DEFAULT_CAPACITY];
    }


    //for initializing arrayList with custom capacity
    public MyArray(int customCapacity) {

        if (customCapacity > 0) {
            this.ELEMENTS = new Object[customCapacity];
        } else {
            throw new IllegalArgumentException("Illegal capacity");
        }
    }

    @Override
    public void add(T element) {
        int mainCapacity = size+1 ;
        if ((mainCapacity - ELEMENTS.length) > 0) {
            grow(mainCapacity);
        }
        ELEMENTS[size++] = element;
    }


    @Override
    public void remove(T element) {
        removeByIndex(indexOf(element));
    }

    @Override
    public void removeByIndex(int index) {

        if (index < size && index > 0) {

            for (int i = index; i < (size - 1); i++) {
                ELEMENTS[i] = ELEMENTS[i + 1];
            }
            ELEMENTS[size-1] = null ;
            size--;

        } else {
            throw new IndexOutOfBoundsException("""
                    index %d is out of range
                    """.formatted(index));
        }

    }

    @Override
    public int indexOf(T element) {

        for (int i = 0; i < size; i++) {
            if (element == ELEMENTS[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T element) {
        return  indexOf(element) > -1 ;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public void print() {
        var list = Arrays.stream(ELEMENTS).filter(Objects::nonNull).toArray();
        System.out.println(String.join(",", Arrays.toString(list)));
    }


    //helping method for increasing size of array
    private void grow(int mainCapacity) {

        var oldCapacity = ELEMENTS.length;
        var newCapacity = oldCapacity + (oldCapacity / 2);

        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = ELEMENTS[i];
        }

        ELEMENTS = newArray;
    }
}
