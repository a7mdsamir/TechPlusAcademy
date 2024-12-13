import java.util.Scanner;

public class methodEx3Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the ARRAY index ");
        int v = scanner.nextInt();
        int[] array = new int[v];

        for (int i =0 ; i < array.length ; i++) {
            System.out.println(" Enter the value # " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println(" The ARRAY sum is " + sum(array) );
        System.out.println(" The ARRAY max is " + max(array) );

    }

    static int sum(int[] a) {
        int sum = 0;
        for (int i =0 ; i < a.length ; i++)
        sum += a[i];

        return sum;
    }
    static int max(int[] a) {
        int max = 0;
        for (int i =0 ; i < a.length ; i++) {
            if (a[i] > max)
                max = a[i] ;
        }
        return max;
    }

}

