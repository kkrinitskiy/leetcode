package org.example;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            switch (c){
                case '(' -> stack.push(')');
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                case ')', '}', ']' -> {
                    if (stack.isEmpty() || stack.pop() != c)
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
