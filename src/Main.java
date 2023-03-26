import containers.list.List;
import containers.list.linkedList.MySinglyLinkedList;
import containers.map.Map;

import containers.list.linkedList.MyCircularLinkedList;
import containers.list.linkedList.MyDoublyLinkedList;
import containers.map.OpenAddressingHashTable;
import containers.map.SeparateChainingHashMap;


public class Main {

    public static void main7(String[] args){

        Map<Integer, String> m = new OpenAddressingHashTable<>();
        m.put(12, "a");
        m.put(36, "b");
        m.put(14, "c");
        m.put(41, "g");
        System.out.println(m);
        m.put(12, "f");
        m.put(36, "l");
        m.put(51, "v");
        System.out.println(m);
        System.out.println(m.get(12));
        System.out.println(m.get(14));
        System.out.println(m.get(41));
        System.out.println(m.get(51));
        m.remove(12);
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.capacity());

    }

    public static void main0(String[] args) {

        Map<Integer, String> m = new SeparateChainingHashMap<>();
        m.put(12, "a");
        m.put(36, "b");
        m.put(14, "c");
        m.put(46, "g");
        System.out.println(m);
        m.put(12, "k");
        System.out.println(m);
        System.out.println(m.get(12));
//        System.out.println(m.size());
//        m.remove(12);
//        System.out.println(m);

    }

    public static void main1(String[] args) {

        MyDoublyLinkedList<String> l = new MyDoublyLinkedList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        System.out.println(l);
        l.revers();
        System.out.println(l);
    }

    public static void main(String[] args) {

        MyCircularLinkedList<String> list = new MyCircularLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("p");
        list.add("t");
        list.add("u");
        System.out.println(list);
        System.out.println(list.kthFromTheEnd(4));
        System.out.println(list.indexOf("u"));

//        System.out.println(list);
//        list.removeByIndex(0);
//        list.remove("c");
//        list.deleteFirst();
//        list.removeByIndex(2);
//        System.out.println(list);

    }

    public static void main3(String[] args) {
        MySinglyLinkedList<String> l = new MySinglyLinkedList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        System.out.println(l);
        l.revers();
        System.out.println(l);

    }
}
