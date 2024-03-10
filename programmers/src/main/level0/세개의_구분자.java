package main.level0;

import java.util.ArrayList;
import java.util.List;

public class 세개의_구분자 {
    public static void main(String[] args) {
        String[] solution = solution("baconlettucetomato");
        for (String s : solution) {
            System.out.printf("%s ", s);
        }
    }

    public static String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        char[] charArray = myStr.toCharArray();
        for (char c : charArray) {
            if (c != 'a' && c != 'b' && c != 'c') {
                sb.append(c);
            } else {
                if (sb.length() != 0) {
                    list.add(sb.toString());
                }
                sb.setLength(0);
            }
        }
        if (sb.length() != 0) {
            list.add(sb.toString());
        }

        return (list.isEmpty()) ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }
}
