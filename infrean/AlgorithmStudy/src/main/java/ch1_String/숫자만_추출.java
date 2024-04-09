package ch1_String;

import java.util.Scanner;

public class 숫자만_추출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]",""));
    }
}
