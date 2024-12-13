import java.util.Scanner;

public class whileEx {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double max =0;
        double min = 0;
        double i =0;
        int counter = 0;
                System.out.println(" Enter the next value ");
     i = scanner.nextDouble();
     max = i;
     min = i;

    while (i != -1) {
        counter += 1 ;
        if (max < i)
            max = i ;
        if (min > i)
            min = i ;
        sum += i;
        System.out.println(" Enter the next value ");
        i = scanner.nextDouble();
            }
        System.out.println(" The sum is " + sum);
        System.out.println(" The max is " + max);
        System.out.println(" The min is " + min);
        System.out.println(" The counter is " + counter);






    }


}