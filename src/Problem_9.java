import java.util.Scanner;
public class Problem_9 {
    public static int binomialCoefficient(int n, int m) {
        if (m == 0 || m == n)
            return 1;

        return binomialCoefficient(n - 1, m - 1) + binomialCoefficient(n - 1, m);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int coef = binomialCoefficient(n, k);

        System.out.println(coef);

    }
}
