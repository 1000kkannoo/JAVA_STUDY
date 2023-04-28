package ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseIfTest {

    public static void main(String[] args) throws IOException {

        int age;
        int charge;

        System.out.println("나이를 입력하세요");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        age = Integer.parseInt(br.readLine());

        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동입니다.");
        }
        else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        else if (age < 20) {
            charge = 2500;
            System.out.println("중, 고등학생 입니다.");
        }
        else {
            charge = 3000;
            System.out.println("일반인입니다.");
        }

        System.out.println("입장료는 " + charge + "원 입니다.");
    }
}
