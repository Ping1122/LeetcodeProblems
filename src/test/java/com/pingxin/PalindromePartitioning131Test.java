package com.pingxin;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromePartitioning131Test {

    @Test
    @DisplayName("Test 131. Palindrome Partitioning")
    public void testPalindromePartitioning131() {
        PalindromePartitioning131 palindromePartitioning131 = new PalindromePartitioning131();
        List<List<String>> result = palindromePartitioning131.partition("aab");
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("a", "a", "b"));
        expected.add(List.of("aa", "b"));
        assertEquals(expected, result);
    }
}
