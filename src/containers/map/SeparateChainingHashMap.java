package containers.map;

import java.util.Arrays;
import java.util.LinkedList;

public class SeparateChainingHashMap<K extends Number, V> implements Map<K, V> {
    private LinkedList<Entry>[] entries;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int size;


    public SeparateChainingHashMap() {
        this.entries = new LinkedList[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    public SeparateChainingHashMap(int capacity) {
        this.entries = new LinkedList[capacity];
        this.capacity = capacity;
    }

    @Override
    public void put(K key, V value) {
        var index = hash(key);
        var bucket = getBucket(key);
        var newEntry = new Entry<>(key, value);

        if (bucket == null) {
            entries[index] = new LinkedList<>();
            entries[index].addLast(newEntry);
            capacity--;
            size++;
            return;
        }
        if (bucket.stream().anyMatch(entry -> entry.getKey().equals(key))) {
            bucket.stream().filter(entry -> entry.getKey().equals(key)).findFirst().orElse(newEntry).setValue(value);
            return;
        }
        bucket.addLast(newEntry);
        capacity--;
        size++;
    }

    @Override
    public Object get(K key) {
        var bucket = getBucket(key);
        if (bucket == null) throw new IllegalStateException();

        return bucket.stream()
                .filter(e -> e.getKey().equals(key))
                .findFirst().orElseThrow(IllegalStateException::new).getValue();
    }


    @Override
    public void remove(K key) {
        var bucket = getBucket(key);
        if (bucket == null) throw new IllegalStateException();
        if (!(bucket.removeIf(entry -> entry.getKey().equals(key)))) throw new IllegalStateException();
        capacity++;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return capacity;
    }


    @Override
    public String toString() {
        return "MyHashMap:%s".formatted(Arrays.toString(entries));
    }

    private int hash(K key) {
        return (int) key % DEFAULT_CAPACITY;
    }


    private LinkedList<Entry> getBucket(K key) {
        return entries[hash(key)];
    }


}
