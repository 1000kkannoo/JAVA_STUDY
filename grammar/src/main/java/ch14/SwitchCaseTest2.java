package ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// JAVA 14버전 이상부터 가능한 코드
public class SwitchCaseTest2 {
/*
    public static void main(String[] args) throws IOException {
        int month;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        month = Integer.parseInt(br.readLine());

        int day = switch (month) {
            case 1,3,5,7,8,10,12 -> {
                yield 31;
            }
            case 2 -> {
                yield 28;
            }
            case 4,6,1 -> {
                yield 30;
            }
            default:
                System.out.println("error");
                yield 0;
        }
        System.out.println(month + "월은 " + day + "일 까지 있습니다.");
    }*/
}
