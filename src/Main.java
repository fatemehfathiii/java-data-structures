import array.Array;
import array.MyArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Array<Double> myArray = new MyArray<>(5);
        myArray.add(2.3);
        myArray.add(3.3);
        myArray.add(2.33);
        myArray.add(6.7);
        myArray.add(3.9);
        myArray.print();
        System.out.println(myArray.size());
        myArray.add(78.2);
        myArray.add(3.5);
        myArray.print();
        System.out.println(myArray.size());
        myArray.removeByIndex(1);
        myArray.print();
        System.out.println(myArray.size());
        myArray.remove(78.2);
        myArray.print();
        System.out.println(myArray.size());
        System.out.println(myArray.contains(6.7));
        System.out.println(myArray.size());

    }
}