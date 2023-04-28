// 정렬된 수에서 하나의 수의 위치 찾기
// 이진 탐색을 활용하면 매번 비교되는 요소의 수가 절반으로 감소되므로 O(logN)의 수행으로
// 원하는 수를 찾을 수 있음
// ! 정렬된 수이기에 가능
public class TreeSearch {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int target = 83;
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;

        int temp = numbers[mid];
        boolean find = false;

        while (left <= right) {
            if (target == temp) {
                find = true;
                break;
            }
            else if (target < temp) {
                right = mid - 1;
            }
            else if (target > temp) {
                left = mid + 1;
            }
            mid = (left + right) / 2;
            temp = numbers[mid];
        }

        if (find == true) {
            System.out.println("찾는 수는 " + (mid + 1) + "번째 있습니다.");
        }
        else {
            System.out.println("찾는 수가 없습니다.");
        }
    }
}
