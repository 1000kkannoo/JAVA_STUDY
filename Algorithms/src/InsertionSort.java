// 정렬 알고리즘
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};

        int i = 0, j = 0;
        int temp = 0;

        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;

            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;

            System.out.println("반복 - " + i);
            printSort(arr);
            System.out.println();
        }
        printSort(arr);
    }

    private static void printSort(int[] arr) {
        for (int num : arr){
            System.out.print(num + "\t");
        }
    }
}
