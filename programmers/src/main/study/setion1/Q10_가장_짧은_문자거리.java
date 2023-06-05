package main.study.setion1;

import java.util.Scanner;

public class Q10_가장_짧은_문자거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        for (int x : solution2(str, t)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(String str, char t) {
        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            int count = 0, lt = i, rt = i;
            while (lt >= 0 || rt < str.length()) {
                lt = (lt < 0) ? 0 : lt;
                rt = (rt == str.length()) ? str.length() - 1 : rt;
                if (str.charAt(lt) == t || str.charAt(rt) == t) {
                    break;
                }
                count++;
                lt--;
                rt++;
            }
            answer[i] = count;
        }
        return answer;
    }

    private static int[] solution2(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
}
