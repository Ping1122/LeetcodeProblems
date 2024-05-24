package com.pingxin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TheNumberOfBeautifulSubsets2597_3 {

    /* 1. Divide nums into groups, each groups contains numbers different by k
     * 2. Run a similar house robber algorithm on each group to find beautiful subset for each group
     * 3. multiply the result for all groups
     */

    public int beautifulSubsets(int[] nums, int k) {
        Map<Integer, Map<Integer, Integer>> groups = new HashMap<>();
        boolean[] visited = new boolean[1001];
        int[] frequency = new int[1001];
        for (int n : nums) {
            frequency[n] += 1;
        }
        for (int n : nums) {
            if (visited[n]) continue;
            Map<Integer, Integer> group = new HashMap<>();
            while (n-k >= 0 && frequency[n-k] != 0) {
                n -= k;
            }
            int smallestN = n;
            while (n < 1001 && frequency[n] != 0) {
                group.put(n, frequency[n]);
                visited[n] = true;
                n += k;
            }
            groups.put(smallestN, group);
        }
        int result = 1;
        int[] mem = new int[1001];
        Arrays.fill(mem, -1);
        for (Map.Entry<Integer, Map<Integer, Integer>> entry: groups.entrySet()) {
            result *= helper(entry.getKey(), entry.getValue(), mem, k);
        }
        return result-1;
    }

    private int helper(int n, Map<Integer, Integer> group, int[] mem, int k) {
        if (!group.containsKey(n)) return 1;
        if (mem[n] != -1) return mem[n];
        int notPick = helper(n+k, group, mem, k);
        int pick = ((int)Math.pow(2, group.get(n))-1) * helper(n+2*k, group, mem, k);
        mem[n] = pick + notPick;
        return notPick + pick;
    }
}
