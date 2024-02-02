package main.level0;

public class 다섯명씩 {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] solution = solution(names);

        for (String s : solution) {
            System.out.println(s);
        }
    }

    public static String[] solution(String[] names) {
        int size = names.length / 5;
        if (names.length % 5 != 0) {
            size++;
        }

        String[] answer = new String[size];
        for (int i = 0, j = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[j++] = names[i];
            }
        }

        return answer;
    }
}
