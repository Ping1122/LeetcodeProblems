public class ReverseWordsInaString {
    class Solution {
        public String reverseWords(String s) {
            if (s == null || s.length() == 0) return s;
            StringBuilder sentence = new StringBuilder();
            StringBuilder word = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    if (word.length() != 0) {
                        sentence.append(word.reverse());
                        sentence.append(' ');
                        word.setLength(0);
                    }
                } else {
                    word.append(s.charAt(i));
                }
            }
            if (word.length() != 0) sentence.append(word.reverse());
            if (sentence.length() != 0 && sentence.charAt(sentence.length()-1) == ' ')
                return sentence.substring(0, sentence.length()-1);
            return sentence.toString();
        }
    }
}
