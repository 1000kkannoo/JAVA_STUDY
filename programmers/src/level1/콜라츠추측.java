package level1;

public class 콜라츠추측 {

    public static void main(String[] args) {
        System.out.println(solution(6));
    }

    public static int solution(long num) {
        long n = num;
        for (int i = 0; i < 500; i++) {
            if (n == 1){
                return i;
            }
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }
}
