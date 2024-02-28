package main.level0;

public class 외계어_사전 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
    }

    public static int solution(String[] spell, String[] dic) {
        for (String s : dic) {
            boolean isExist = false;
            for (String sp : spell) {
                if (s.contains(sp)) {
                    isExist = true;
                } else {
                    isExist = false;
                    break;
                }
            }

            if (isExist) return 1;
        }
        return 2;
    }
}
