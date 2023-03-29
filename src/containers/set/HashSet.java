package containers.set;

import java.util.HashMap;

public class HashSet<E> implements Set<E> {

    private HashMap<E, Object> values;
    private static final Object PRESENT = new Object();

    public HashSet() {
        this.values = new HashMap<>();
    }

    public HashSet(int size) {
        this.values = new HashMap<>(size);
    }

    @Override
    public boolean add(E value) {
        return values.put(value, PRESENT) == null;
    }

    @Override
    public boolean remove(E value) {
        return values.remove(value) == null;
    }

    @Override
    public boolean contain(E value) {
        return values.containsKey(value);
    }

    @Override
    public boolean isEmpty() {
        return values.isEmpty();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public void print() {
        System.out.println(this);
    }


    @Override
    public String toString() {
       return values.keySet().toString();
    }
}
