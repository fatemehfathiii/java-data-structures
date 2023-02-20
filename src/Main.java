import containers.List;
import containers.arrayList.MyArrayList;
import containers.linkedList.MySinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.addLast("f");
        list.addLast("g");
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();



    }
}