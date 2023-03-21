package containers;

public interface Map<K extends Number, V> {
    void put(K key, V value);
    Object get(K key);
     void remove(K key);
     int size();
}
