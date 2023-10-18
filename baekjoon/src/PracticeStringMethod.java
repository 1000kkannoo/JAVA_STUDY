import java.util.*;

public class PracticeStringMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "Hello, Java";
        String reverseStr = "avaJ ,olleH";
        String spaceStr = " Hello, Java ";
        String exStr = "abcdefg";
        String exStr2 = "ab2vaw";

        sb.append("1. ").append(getLength(str)).append("\n");
        sb.append("2. ").append(getIndexStr(str, 0)).append("\n");
        sb.append("3. ").append(getSubstring(str)).append("\n");
        sb.append("4. ").append(getContains(str, "Java")).append("\n");
        sb.append("5. ").append(getStart(str, "c")).append("\n");
        sb.append("6. ").append(getReplace(str)).append("\n");
        sb.append("7. ").append(str.toUpperCase()).append(" ").append(str.toLowerCase()).append("\n");
        sb.append("8. ").append(spaceStr.trim()).append("\n");
        sb.append("9. ").append(getSplitStr(str)).append("\n");
        sb.append("10. ").append(str.compareTo(exStr)).append("\n");
        sb.append("11. ").append(isAlphabetic(exStr2)).append("\n");
        sb.append("12. ").append(isDigit(exStr2)).append("\n");
        sb.append("13. ").append(allDeleteTrim(spaceStr)).append("\n");
        sb.append("14. ").append(toReverse(str)).append("\n");
        sb.append("15. ").append(toCountWord(str, 'l')).append("\n");
        sb.append("16. ").append(toEasyEquals(str, str)).append("\n");
        sb.append("17. ").append(toSet(str)).append("\n");
        sb.append("18. ").append(toReplace2(str)).append("\n");
        sb.append("19. ").append(toHighCount(exStr2)).append("\n");
        sb.append("20. ").append(isSubstring(str, exStr2)).append("\n");

        System.out.println(sb);
    }

    private static String isSubstring(String str, String exStr2) {
        return exStr2.concat(exStr2);
    }

    private static String toHighCount(String exStr2) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : exStr2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Map.Entry<Character, Integer> entryMap = map.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .findFirst()
                .get();

        return sb.append(entryMap.getKey()).append(" ").append(entryMap.getValue()).toString();
    }

    private static String toReplace2(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static String toSet(String str) {
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        for (String s : set) {
            sb.append(s);
        }
        return sb.toString();
    }

    private static String toEasyEquals(String str, String str1) {
        String[] split = str.split("");
        String[] split1 = str1.split("");
        Arrays.sort(split);
        Arrays.sort(split1);
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(split1[i])) {
                return "NO";
            }
        }
        return "YES";
    }

    private static long toCountWord(String str, char c) {
        return str.chars().filter(ch -> ch == c).count();
    }

    private static String toReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String allDeleteTrim(String spaceStr) {
        return spaceStr.replace(" ", "");
    }

    private static String isDigit(String exStr2) {
        for (char c : exStr2.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "NO";
            }
        }
        return "YES";
    }

    private static String isAlphabetic(String exStr2) {
        for (char c : exStr2.toCharArray()) {
            if (!Character.isAlphabetic(c))
                return "NO";
        }
        return "YES";
    }

    private static String getSplitStr(String str) {
        String[] split = str.split(" ");
        return split[0] + "/" + split[1];
    }

    private static String getReplace(String str) {
        return str.replace("a", "B");
    }

    private static int getStart(String str1, String str2) {
        return str1.indexOf(str2);
    }

    private static boolean getContains(String str1, String str2) {
        return str1.contains(str2);
    }

    private static String getSubstring(String str) {
        return str.substring(1, 7);
    }

    private static int getLength(String str) {
        return str.length();
    }

    private static char getIndexStr(String str, int i) {
        return str.charAt(i);
    }
}
