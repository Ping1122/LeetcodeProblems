package com.pingxin;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialArrayWithXElementsGreaterThanOrEqualX1608Test {

    @Test
    @DisplayName("1608. Special Array With X Elements Greater Than or Equal X")
    public void testTheNumberOffBeautifulSubsets2597_1() {
        SpecialArrayWithXElementsGreaterThanOrEqualX1608 specialArrayWithXElementsGreaterThanOrEqualX1608= new SpecialArrayWithXElementsGreaterThanOrEqualX1608();
        int result = specialArrayWithXElementsGreaterThanOrEqualX1608.specialArray(new int[] {0, 4, 3, 0, 4});
        int expected = 3;
        assertEquals(expected, result);
    }
}
