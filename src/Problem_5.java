import java.util.Scanner;

public class Problem_5 {
    public static int fibonacci(int n){
        if (n== 0)
            return 0;
        else if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fibonacciNum = fibonacci(n);

        // Output the result
        System.out.println(fibonacciNum);

    }
}
