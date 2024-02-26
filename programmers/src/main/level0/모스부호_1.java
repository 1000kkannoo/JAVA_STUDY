package main.level0;

import java.util.Map;

public class 모스부호_1 {

    public static final Map<String, Character> MORSE_CODE_MAP = Map.ofEntries(
            Map.entry(".-", 'a'),
            Map.entry("-...", 'b'),
            Map.entry("-.-.", 'c'),
            Map.entry("-..", 'd'),
            Map.entry(".", 'e'),
            Map.entry("..-.", 'f'),
            Map.entry("--.", 'g'),
            Map.entry("....", 'h'),
            Map.entry("..", 'i'),
            Map.entry(".---", 'j'),
            Map.entry("-.-", 'k'),
            Map.entry(".-..", 'l'),
            Map.entry("--", 'm'),
            Map.entry("-.", 'n'),
            Map.entry("---", 'o'),
            Map.entry(".--.", 'p'),
            Map.entry("--.-", 'q'),
            Map.entry(".-.", 'r'),
            Map.entry("...", 's'),
            Map.entry("-", 't'),
            Map.entry("..-", 'u'),
            Map.entry("...-", 'v'),
            Map.entry(".--", 'w'),
            Map.entry("-..-", 'x'),
            Map.entry("-.--", 'y'),
            Map.entry("--..", 'z')
    );

    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
    }

    public static String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] split = letter.split(" ");
        for (String s : split) {
            sb.append(MORSE_CODE_MAP.get(s));
        }
        return sb.toString();
    }
}
