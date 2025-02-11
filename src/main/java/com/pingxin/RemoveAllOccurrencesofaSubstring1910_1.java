package com.pingxin;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveAllOccurrencesofaSubstring1910_1 {
    public String removeOccurrences(String s, String part) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
            if (stack.size() >= part.length()) {
                Deque<Character> temp = new LinkedList<>();
                for (int j = part.length()-1; j >= 0; j--) {
                    if (part.charAt(j) == stack.peek()) {
                        temp.push(stack.pop());
                    } else {
                        while (!temp.isEmpty()) {
                            stack.push(temp.pop());
                        }
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }
        return sb.toString();

    }
}
