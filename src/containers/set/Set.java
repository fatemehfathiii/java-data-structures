package containers.set;

public interface Set <E>{
    boolean add(E value);
    boolean remove(E value);
    boolean contain(E value);
    boolean isEmpty();
    int size();
    void print();

}
