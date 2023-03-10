package containers;

public interface Map<K extends Number, V> {
    void put(K key, V value);

    V get(K key);
     int size();
}
