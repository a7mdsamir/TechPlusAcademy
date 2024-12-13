import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number is " );
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number is " );
        int num2 = scanner.nextInt();

        System.out.println("Numbers between are ");
        for (int i = num1 ; i < (num2 - 1) ; i++)
            System.out.print(" "+ (i+1) );

        if (num2 % 2 == 1)
            System.out.println(" " + num2 );
        else
            System.out.println(" " + (num2 - 1 ) );
//        int [] array = {2, 6, 8, 5, 7, 3} ;
//        int sum = 0 ;
//
//
//        System.out.println("Enter a number to check "  );
//        int x = scanner.nextInt();
//        boolean isFound = false ;
//
//        for (int i =0 ; i < array.length ; i++)
//
//
    }


}