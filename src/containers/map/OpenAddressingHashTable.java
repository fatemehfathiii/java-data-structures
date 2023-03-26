package containers.map;

import java.util.Arrays;

public class OpenAddressingHashTable<K extends Number, V> implements Map<K, V> {
    private final Entry[] entries;
    private static final int DEFAULT_CAPACITY = 10;
    int capacity;
    int size;

    public OpenAddressingHashTable() {
        this.entries = new Entry[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    @Override
    public void put(K key, V value) {
        var index = hash(key);
        var newEntry = new Entry<>(key, value);

        if (entries[index] != null && entries[index].getKey().equals(key)) {
            entries[index]= newEntry;
            return;
        }
        while (entries[index] != null) {
            index++;
            index = reHash(index);
        }
        entries[index] = new Entry<>(key, value);
        size++;
        capacity--;
    }

    @Override
    public Object get(K key) {
        var index = hash(key);
        if (entries[index] == null) return null;

        while (entries[index] != null) {
            if (entries[index].getKey().equals(key)) return entries[index].getValue();
            index++;
            index = reHash(index);
        }

        return null;
    }

    @Override
    public void remove(K key) {
        var index = hash(key);
        if (entries[index] == null) return;

        while (entries[index] != null) {

            if (entries[index].getKey().equals(key)) {
                entries[index] = null;
                return;
            }
            index++;
            index = reHash(index);
        }
        size--;
        capacity++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    public String toString() {
        return "MyHashMap:%s".formatted(Arrays.toString(entries));
    }

    private int hash(K key) {
        return (int) key % DEFAULT_CAPACITY;
    }

    private int reHash(int index) {
        return index % DEFAULT_CAPACITY;
    }
}
