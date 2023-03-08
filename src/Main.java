import containers.linkedList.MyCircularLinkedList;

public class Main {
    public static void main(String[] args) {

        MyCircularLinkedList<String> list = new MyCircularLinkedList<>();
        list.add("a");
        list.add("x");
        list.add("c");
        list.add("v");
        list.add("l");
        list.add("j");
        System.out.println(list);
        System.out.println(list.get(2));
        list.deleteFirst();
        System.out.println(list);


    }
}