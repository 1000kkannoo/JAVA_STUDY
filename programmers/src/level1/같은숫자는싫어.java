package level1;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }

    public static int[] solution(int[] arr) {
        int i = 0;
        int j = 0;

        for (; i < arr.length - 1; ) {
            if (j > arr.length - 2) {
                break;
            }
            if (arr[i] == arr[j + 1]) {
                arr[j + 1] = -1;
                j++;
                continue;
            }
            i = j + 1;
            j = i;
        }

        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                answer[index] = arr[i];
                index++;
            }
        }

        return answer;
    }
}
