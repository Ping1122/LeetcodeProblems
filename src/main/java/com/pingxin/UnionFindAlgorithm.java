package com.pingxin;

public class UnionFindAlgorithm {
    private int count;
    private final int[] parents;

    public UnionFindAlgorithm(int n) {
        count = n;
        parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;
        parents[p] = q;
        count--;
    }

    public int find(int p) {
        if (parents[p] != p) {
            parents[p] = find(p);
        }
        return parents[p];
    }

    public boolean connected (int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return count;
    }
}
