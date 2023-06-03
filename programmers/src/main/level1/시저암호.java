package main.level1;

// a = 97, z = 122
// A = 65, Z = 90
public class 시저암호 {
    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] array = s.toCharArray();
        boolean[] upper = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if ((int) array[i] >= 65 && (int) array[i] <= 90) {
                upper[i] = true;
                array[i] = Character.toLowerCase(array[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                sb.append(' ');
                continue;
            }
            int value = (array[i] + n > 122) ?
                    97 + ((array[i] + n) - 123) : array[i] + n;
            sb = (upper[i]) ?
                    sb.append(Character.toUpperCase((char) value)) : sb.append((char) value);
        }
        return new String(sb);
    }
}
