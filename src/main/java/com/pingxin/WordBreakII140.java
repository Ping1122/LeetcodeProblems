package com.pingxin;

import java.util.*;

public class WordBreakII140 {
    private String s;
    private List<String> wordDict;
    private Set<String> wordSet;
    private boolean[] prefix;
    private List<String> result;
    private List<String> currentList;

    public List<String> wordBreak(String s, List<String> wordDict) {
        this.s = s;
        this.wordDict = wordDict;
        wordSet = new HashSet<>(wordDict);
        wordDict.sort(Comparator.naturalOrder());
        prefix = new boolean[wordDict.size()];
        for (int i = 0; i < wordDict.size()-1; i++) {
            prefix[i] = wordDict.get(i+1).startsWith(wordDict.get(i));
        }
        result = new ArrayList<>();
        currentList = new ArrayList<>();
        traverse("", 0, 0);
        return result;
    }

    private void traverse(String current, int right, int index) {
        if (right >= s.length()) {
            if (!current.isEmpty()) return;
            StringBuilder sb = new StringBuilder();
            for (String string : currentList) {
                sb.append(string).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            result.add(sb.toString());
            return;
        }
        current = current + s.charAt(right);
        index = binarySearch(index, current);
        if (index == wordDict.size()) return;
        if (!wordDict.get(index).startsWith(current)) return;
        if (wordDict.get(index).equals(current)) {
            currentList.add(current);

            traverse("", right+1, 0);
            currentList.removeLast();
        }
        if (!wordDict.get(index).equals(current) || prefix[index]) {
            traverse(current, right+1, index);
        }
    }

    private int binarySearch(int left, String current) {
        int right = wordDict.size()-1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (wordDict.get(middle).compareTo(current) >= 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
