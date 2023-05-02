package level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"abce", "abcd", "cdx"},2));
    }

    public static String[] solution(String[] s, int n) {
        Arrays.sort(s, (o1, o2) -> {
            char c1 = o1.charAt(n);
            char c2 = o2.charAt(n);
            return (c1 == c2) ? o1.compareTo(o2) : c1 - c2;
        });

        return s;
    }
}
