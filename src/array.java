import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the ARRAY index ");
        int v = scanner.nextInt();
        int [] array = new int[v] ;
        int sum = 0 ;

        for (int i =0 ; i < array.length ; i++) {
            System.out.println(" Enter the value # " + (i+1) );
            array[i] = scanner.nextInt();
            if (array[i] >= 10)
                sum += array[i] ;
            else
                sum =0;
        }
        // From array[0] To array[array.length]
        for (int i =0 ; i < array.length ; i++) {
            System.out.println(" The values are " + array[i] );

        }
        // From array[array.length] To array[0]
        for (int i =array.length ; i > 0 ; i--) {
            System.out.println(" The values are " + array[i-1] );

        }

//        System.out.println(" The last value is " + array[v-1] );
        System.out.println(" The Sum is " + sum );






    }


}