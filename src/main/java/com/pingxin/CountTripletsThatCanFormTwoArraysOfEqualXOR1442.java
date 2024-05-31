package com.pingxin;

import java.util.HashMap;
import java.util.Map;

public class CountTripletsThatCanFormTwoArraysOfEqualXOR1442 {

    /* Key observations:
    *       1. if a ^ b ^ c ^ d = 0, then a = b ^ c ^ d
    *       2. use a prefix XOR set to record the prefix values
    *       3. we only need to record the occurrence and the sum of the index
    * */
    public int countTriplets(int[] arr) {
        Map<Integer, int[]> occurrence = new HashMap<>();
        int presum = 0;
        int result = 0;
        for (int i = 0; i < arr.length+1; i++) {
            if (occurrence.containsKey(presum)) {
                int[] prev = occurrence.get(presum);
                result += prev[0] * (i-1) - prev[1];
            }
            int[] prev = occurrence.getOrDefault(presum, new int[]{0, 0});
            int[] curr = new int[]{prev[0]+1, prev[1]+i};
            occurrence.put(presum, curr);
            if (i < arr.length) presum ^= arr[i];
        }
        return result;
    }
}
