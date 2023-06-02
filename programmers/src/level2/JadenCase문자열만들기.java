package level2;

public class JadenCase문자열만들기 {

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed    me  "));
    }

    public static String solution(String s) {

        String[] strArray = s.toLowerCase().split("");
        boolean toggle = true;

        for (int i = 0; i < strArray.length; i++) {
            if (toggle) {
                strArray[i] = strArray[i].toUpperCase();
            }
            toggle = strArray[i].equals(" ");
        }

        return String.join("", strArray);
    }
}
