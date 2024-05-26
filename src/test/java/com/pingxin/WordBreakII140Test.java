package com.pingxin;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordBreakII140Test {
    @Test
    @DisplayName("Test 140. Word Break II")
    public void testWordBreakII140() {
        WordBreakII140 wordBreakII140 = new WordBreakII140();

        List<String> result = wordBreakII140.wordBreak("pineapplepenapple", new ArrayList<>(List.of("apple","pen","applepen","pine","pineapple")));
        List<String> expected = new ArrayList<>(List.of("pine apple pen apple","pineapple pen apple","pine applepen apple"));
        result.sort(Comparator.naturalOrder());
        expected.sort(Comparator.naturalOrder());
        assertEquals(expected, result);
    }
}
