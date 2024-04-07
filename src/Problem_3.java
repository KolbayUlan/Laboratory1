import java.util.Scanner;

public class Problem_3 {
    public static boolean isPrime(int n, int m) {
        if (n <= 1)
            return false;
        if (m == 1)
            return true;
        if (n % m == 0)
            return false;

        return isPrime(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = isPrime(n, (int)Math.sqrt(n));

        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }

}
