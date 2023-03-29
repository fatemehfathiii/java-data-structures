package containers.interview_questions;

import java.util.Stack;

public class ReverseString {
    /**
     * Write a method that takes a string and prints it in reverse.
     */
    public static String reverseString(String income) {
        if (income == null || income.trim().equals("")) throw new IllegalArgumentException();

        var tempStack = new Stack<Character>();

        for (Character chars : income.toCharArray()) {
            tempStack.push(chars);
        }

        var reversed = new StringBuilder();
        while (!tempStack.isEmpty()){
            reversed.append(tempStack.pop());
        }
        return reversed.toString();
    }
}
