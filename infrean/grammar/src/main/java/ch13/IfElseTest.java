package ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseTest {

    public static void main(String[] args) throws IOException {
        int age;

        System.out.println("나이를 입력하세요");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        age = Integer.parseInt(br.readLine());

        if (age >= 8) {
            System.out.println("학교에 갑니다.");
        }
        else {
            System.out.println("학교에 가지 않습니다.");
        }
    }
}
