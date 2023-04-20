package ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseTest1 {

    public static void main(String[] args) throws IOException {
        int month;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        month = Integer.parseInt(br.readLine());

        int day = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6: case 11:
                day = 30;
                break;
            default:
                System.out.println("error");
        }
        System.out.println(month + "월은 " + day + "일 까지 있습니다.");
    }
}
