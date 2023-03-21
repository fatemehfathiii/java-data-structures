package containers.map;

import containers.Map;

import java.util.Arrays;
import java.util.LinkedList;


public class MyHashMap<K extends Number, V> implements Map<K, V> {

    private LinkedList<Entry>[] entries;
    private int size;

    public MyHashMap() {
        this.entries = new LinkedList[5];
    }

    @Override
    public void put(K key, V value) {
        var index = hash(key);
        var bucket = getBucket(key);
        var newEntry = new Entry<>(key, value);

        if (bucket == null) {
            entries[index] = new LinkedList<>();
            entries[index].addLast(newEntry);
            return;
        }
        if (bucket.stream().anyMatch(entry -> entry.key.equals(key))) {
            bucket.stream().filter(entry -> entry.key.equals(key)).findFirst().map(entry -> entry.value = value);
            return;
        }
        bucket.addLast(newEntry);
    }

    @Override
    public Object get(K key) {
        var bucket = getBucket(key);
        if (bucket == null) throw new IllegalStateException();

        return bucket.stream()
                .filter(e -> e.key.equals(key))
                .findFirst().orElseThrow(IllegalStateException::new).value;
    }


    @Override
    public void remove(K key) {
        var bucket = getBucket(key);
        if (bucket == null) throw new IllegalStateException();
        if (!(bucket.removeIf(entry -> entry.key.equals(key)))) throw new IllegalStateException();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashMap:%s".formatted(Arrays.toString(entries));
    }


    private int hash(K key) {
        return (int) key % entries.length;
    }

    private LinkedList<Entry> getBucket(K key) {
        return entries[hash(key)];
    }

    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "%s".formatted(value);
        }
    }
}
