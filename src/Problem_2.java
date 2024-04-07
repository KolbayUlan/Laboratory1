import java.util.Scanner;

public class Problem_2 {
    public static double returnAverage(int[] arr, int n) {
        if (n == 0)
            return 0;
        double sum =returnAverage(arr, n - 1) * (n - 1);
        sum += arr[n - 1];
        return sum / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double average = returnAverage(arr, n);
        System.out.println(average);
    }
}