package stringPratice;

import java.util.HashMap;
import java.util.Map;

public class Seversestring {
    public static void main(String[] args) {
        Seversestring ss = new Seversestring();
        // ss.reversestring();
        String inputStr = "test engineer";
        Map<Character, Integer> result = countCharacters(inputStr);
        System.out.println(result);

    }

    public void reversestring() {
        String str = "Surya";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("reverse String is:" + sb);

        if (sb.equals(str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }


        public static Map<Character, Integer> countCharacters(String inputString) {
            Map<Character, Integer> charCounts = new HashMap<>();
            for (char ch : inputString.toCharArray()) {
                charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
            }
            return charCounts;
        }

}
