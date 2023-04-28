package ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionTest {

    public static void main(String[] args) throws IOException {
        int max;
        System.out.println("두 수를 입력 받아서 큰 수를 출력하세요");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input1 : ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("input2 : ");
        int y = Integer.parseInt(br.readLine());

        max = (x >= y) ? x : y; // Math 클래스에서도 이와같이 되어있다.
        int max2 = Math.max(x,y);
        System.out.println(max);
        System.out.println(max2);
    }
}
