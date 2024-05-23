package com.pingxin;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheNumberOffBeautifulSubsets2597_1Test {
    @Test
    @DisplayName("Test 2597. The Number of Beautiful Subsets")
    public void testTheNumberOffBeautifulSubsets2597_1() {
        TheNumberOfBeautifulSubsets2597_1 theNumberOfBeautifulSubsets2597_1 = new TheNumberOfBeautifulSubsets2597_1();
        int result = theNumberOfBeautifulSubsets2597_1.beautifulSubsets(new int[]{2, 4, 6}, 2);
        int expected = 4;
        assertEquals(expected, result);
    }
}
