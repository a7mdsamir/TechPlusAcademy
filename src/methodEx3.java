import java.util.Scanner;

public class methodEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base");
        int base = scanner.nextInt();
        System.out.println("Enter exp");
        int exp = scanner.nextInt();
        int m = integerPower(base , exp);
        System.out.println("Result is " + m);

    }
    static int integerPower(int base , int exp) {

        int result = base;

        if (exp == 0) {
            result = 1;
        }
//        if (exp < 0) {
//            base = (1 / base);
//            exp = -exp;
//        }

        for (int n = 1; n < exp; n ++) {
            result = result * base;
//            return result;
        }
        return result;
    }
}

