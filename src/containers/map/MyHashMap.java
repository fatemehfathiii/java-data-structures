package containers.map;

import containers.Map;

import java.util.Arrays;
import java.util.LinkedList;


public class MyHashMap<K extends Number, V> implements Map<K, V> {

    private final LinkedList<HashNode<K, V>>[] objects;

    private int size;

    public MyHashMap() {
        this.objects = new LinkedList[10];
    }

    @Override
    public void put(K key, V value) {
        var index = myHashFunction(key);
        var pair = new HashNode<>(key, value);

        if (objects[index] == null) {
            objects[index] = new LinkedList<>();
        }

        objects[index].addLast(pair);
        size++;
    }

    @Override
    public V get(K key) {
        var index = myHashFunction(key);
        var bucket = objects[index].stream().filter(v -> v.key.equals(key)).findFirst();
        return bucket.map(kvHashNode -> kvHashNode.value).orElse(null);
    }

    private int myHashFunction(K key) {
        return (int) key % objects.length;
    }

    @Override
    public String toString() {
        return "MyHashMap:%s".formatted(Arrays.toString(objects));
    }
    @Override
    public int size(){
        return size;
    }


    private static class HashNode<K, V> {
        K key;
        V value;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "%s".formatted(value);
        }
    }
}
