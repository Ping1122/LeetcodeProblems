package com.pingxin;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTripletsThatCanFormTwoArraysOfEqualXOR1442Test {
    @Test
    @DisplayName("Test 1442. Count Triplets That Can Form Two Arrays of Equal XOR")
    public void testCountTripletsThatCanFormTwoArraysOfEqualXOR1442() {
        CountTripletsThatCanFormTwoArraysOfEqualXOR1442 countTripletsThatCanFormTwoArraysOfEqualXOR1442 = new CountTripletsThatCanFormTwoArraysOfEqualXOR1442();
        int result = countTripletsThatCanFormTwoArraysOfEqualXOR1442.countTriplets(new int[]{2, 3, 1, 6, 7});
        int expected = 4;
        assertEquals(expected, result);
    }
}
