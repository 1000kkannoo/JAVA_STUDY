package level1;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(125));
    }

    public static int solution(int n) {
        int var = 1;

        // 배열의 크기를 구한다.
        while (n >= (int) Math.pow(3, var)) {
            var++;
        }

        // 배열의 크기만큼 3진법으로 해당 수를 표현
        int[] array = new int[var];
        for (int i = 0, j = var - 1; i < var; i++, j--) {
            array[i] = (j == 0) ? n : n / (int) Math.pow(3, j);
            n %= (int) Math.pow(3, j);
        }

        int plus = 0;
        int minus = array.length - 1;

        // 배열로 선언된 3진법 뒤짚기
        while (plus < minus) {
            int temp = array[plus];
            array[plus] = array[minus];
            array[minus] = temp;
            plus++;
            minus--;
        }

        // 뒤짚은 3진법을 10진법으로 표현
        int sum = 0;
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            sum += (i == array.length - 1) ? array[i] : Math.pow(3, j) * array[i];
        }
        return sum;
    }
}
