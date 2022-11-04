public class ReverseVowelsOfAString345 {
    private static char[] vowels  = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;

        int i = 0;
        int j = s.length() - 1;
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        while (i < j) {
            if (!isVowel(s.charAt(i))) left.append(s.charAt(i++));
            else if (!isVowel(s.charAt(j))) right.append(s.charAt(j--));
            else {
                right.append(s.charAt(i++));
                left.append(s.charAt(j--));
            }
        }
        if (i == j) left.append(s.charAt(i));
        left.append(right.reverse());
        return left.toString();
    }

    private boolean isVowel(char c) {
        for (char v : vowels) {
            if (v == c) return true;
        }
        return false;
    }
}
