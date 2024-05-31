package com.pingxin;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberIII260Test {

    @Test
    @DisplayName("Test 260. Single Number III")
    public void testSingleNumberIII260() {
        SingleNumberIII260 singleNumberIII260 = new SingleNumberIII260();
        int[] result = singleNumberIII260.singleNumber(new int[] {1,2,1,3,2,5});
        int[] expected = new int[] {3, 5};
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
}
