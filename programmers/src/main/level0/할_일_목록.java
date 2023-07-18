package main.level0;

public class 할_일_목록 {
    public static void main(String[] args) {
        for (String str : solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false})) {
            System.out.println(str);
        }
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for (boolean isTrue : finished) {
            if (!isTrue) size++;
        }

        String[] arr = new String[size];
        int j = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                arr[j++] = todo_list[i];
            }
        }

        return arr;
    }
}
