package containers.arrayList;


import containers.List;

public class MyArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] ELEMENTS;
    private int size;

    //for initializing arrayList with default capacity(20)
    public MyArrayList() {
        this.ELEMENTS = new Object[DEFAULT_CAPACITY];
    }


    //for initializing arrayList with custom capacity
    public MyArrayList(int customCapacity) {

        if (customCapacity < 1)
            throw new IllegalArgumentException("Illegal capacity");

        this.ELEMENTS = new Object[customCapacity];

    }

    @Override
    public void add(E element) {
        int mainCapacity = size + 1;
        if ((mainCapacity - ELEMENTS.length) > 0) {
            grow();
        }
        ELEMENTS[size++] = element;
    }


    @Override
    public void remove(E element) {
        removeByIndex(indexOf(element));
    }

    @Override
    public void removeByIndex(int index) {
        indexRangeValidation(index);
        for (int i = index; i < (size - 1); i++) {
            ELEMENTS[i] = ELEMENTS[i + 1];
        }
        ELEMENTS[size - 1] = null;
        size--;
    }

    @Override
    public int indexOf(E element) {

        for (int i = 0; i < size; i++) {
            if (element.equals(ELEMENTS[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        indexRangeValidation(index);
        return (E) ELEMENTS[index];
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
        var arrayString = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            arrayString.append(ELEMENTS[i]);
            if (i < size - 1){
                arrayString.append(",");
            }
        }
        arrayString.append("]");
        System.out.println(arrayString);
    }


    //helping method for increasing size of array
    private void grow() {

        var oldCapacity = ELEMENTS.length;
        var newCapacity = oldCapacity + (oldCapacity / 2);

        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = ELEMENTS[i];
        }

        ELEMENTS = newArray;
    }
    //helping method for validate index
    private boolean indexRangeValidation(int index){
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("index should be greater than 0 or less than %d".formatted(size));
        }
         return true;
    }
}
