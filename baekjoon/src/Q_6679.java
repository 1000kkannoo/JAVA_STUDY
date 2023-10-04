public class Q_6679 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1000; i <= 9999; i++) {
            int sum1 = getAllPlus(i, 10);
            int sum2 = getAllPlus(i, 12);
            int sum3 = getAllPlus(i, 16);
            if (sum1 == sum2 & sum2 == sum3) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int getAllPlus(int number, int base) {
        int sum = 0;
        while (number > 0) {
            sum += number % base;
            number /= base;
        }
        return sum;
    }
}
