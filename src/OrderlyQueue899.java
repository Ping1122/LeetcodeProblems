import java.util.Arrays;

public class OrderlyQueue899 {
    public String orderlyQueue(String s, int k) {
        if (s == null || s.length() == 0) return s;

        String min = s;
        if (k == 1) {
            for(int i = 0; i < s.length(); i++) {
                s = s.substring(1, s.length()) + s.substring(0, 1);
                if (min.compareTo(s) > 0) {
                    min = s;
                }
            }
            return min;
        }
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
