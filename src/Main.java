import containers.linkedList.MyDoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        MyDoublyLinkedList<String> list = new MyDoublyLinkedList<>();
        list.addFirst("a");
        list.addFirst("x");
        list.addFirst("c");
        list.addFirst("v");
        list.addLast("l");
        list.addLast("j");
        System.out.println(list);

        System.out.println(list.get(2));

    }
}