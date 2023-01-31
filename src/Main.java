import array.Array;
import array.MyArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Array myArray = new MyArray(4);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        System.out.println(myArray.size());
        myArray.add(5);
        myArray.add(6);
        System.out.println(myArray.size());

    }
}