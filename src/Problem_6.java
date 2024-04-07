import java.util.Scanner;
public class Problem_6{
    public static double power(double a, int n) {
        if (n == 0)
            return 1;

        if (n <0){
            a = 1 /a;
            n = -n;
        }

        return (n % 2 == 0) ? power(a * a, n / 2) : a *power(a * a, (n - 1)/ 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();

        double res = power(a, n);

        System.out.println(res);

    }
}
