package main.level0;

public class 가위_바위_보 {
    public static void main(String[] args) {
        System.out.println(solution("205"));
    }

    private static String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (char ch : rsp.toCharArray()) {
            switch (ch) {
                case '2' : sb.append('0');
                break;
                case '0' : sb.append('5');
                break;
                case '5' : sb.append('2');
            }
        }
        return sb.toString();
    }
}
