import java.util.Scanner;

public class Problem_7 {
    public static void reverseArray(int[] arr, int begin, int end) {

        if (begin >=end || arr == null || arr.length == 0)
            return;

        int temp = arr[begin];
        arr[begin] = arr[end];
        arr[end] = temp;

        reverseArray(arr, begin + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, n - 1);

        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
