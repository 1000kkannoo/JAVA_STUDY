package main.level0;

public class 옷가게_할인_받기 {
    public static void main(String[] args) {
        System.out.println(solution(500000));
    }

    private static int solution(int price) {

        if (price >= 500000) {
            return (int) (price * (1 - 0.2));
        } else if (price >= 300000) {
            return (int) (price * (1 - 0.1));
        } else if (price >= 100000) {
            return (int) (price * (1 - 0.05));
        }

        return price;
    }
}
