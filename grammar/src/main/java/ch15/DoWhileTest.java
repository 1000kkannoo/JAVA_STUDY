package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileTest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input;
        int sum = 0;

        do {
            System.out.print("num: ");
            input = Integer.parseInt(br.readLine());
            sum += input;
        } while (input != 0);

        System.out.println(sum);

    }
}
