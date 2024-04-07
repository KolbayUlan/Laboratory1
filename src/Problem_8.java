import java.util.Scanner;

public class Problem_8 {
    public static boolean isDigits(String s, int index) {
        if (index >= s.length())
            return true;

        char currChar = s.charAt(index);

        if (Character.isDigit(currChar)) {
            return isDigits(s, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        boolean isDigits = isDigits(s, 0);

        if (isDigits)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
