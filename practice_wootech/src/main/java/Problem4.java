import java.util.HashMap;
import java.util.Map;

public class Problem4 {

    public static void main(String[] args) {
        System.out.println(solution("I love you"));
    }

    private static String solution(String word) {
        Map<Character, Character> map = englishConversionMap();

        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            boolean isUpperCase = Character.isUpperCase(c);
            if (c == ' ') {
                sb.append(c);
            } else if (isUpperCase) {
                sb.append(map.get(c));
            } else {
                Character upperCh = map.get(Character.toUpperCase(c));
                sb.append(Character.toLowerCase(upperCh));
            }
        }

        return sb.toString();
    }

    private static Map<Character, Character> englishConversionMap() {
        Map<Character, Character> map = new HashMap<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            char mappedChar = (char) ('A' + 'Z' - c);
            map.put(c, mappedChar);
        }
        return map;
    }
}
