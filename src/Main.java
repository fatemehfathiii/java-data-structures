import containers.Map;

import containers.linkedList.MyCircularLinkedList;
import containers.linkedList.MyDoublyLinkedList;
import containers.map.MyHashMap;


public class Main {

    public static void main(String[] args) {

        Map<Integer, String> m = new MyHashMap<>();
        m.put(12, "a");
        m.put(36, "b");
        m.put(14, "c");
        m.put(46, "g");
        System.out.println(m);
        m.put(12,"k");
        System.out.println(m);
        System.out.println(m.get(12));
        System.out.println(m.size());
        m.remove(12);
        System.out.println(m);

    }

    public static void main1(String[] args) {

        MyDoublyLinkedList<String> list = new MyDoublyLinkedList<>();
        list.add("a");
        list.add("x");
        list.add("c");
        list.add("v");
        list.add("l");
        list.add("j");
        System.out.println(list);
        list.removeByIndex(5);
        System.out.println(list);
    }

    public static void main2(String[] args) {

        MyCircularLinkedList<String> list = new MyCircularLinkedList<>();
        list.add("a");
        list.add("x");
        list.add("c");
        list.add("v");
        list.add("l");
        list.add("j");
//        System.out.println(list);
//        list.removeByIndex(0);
//        list.remove("c");
//        list.deleteFirst();
//        list.removeByIndex(2);
//        System.out.println(list);

        System.out.println(list.indexOf("a"));
    }


}