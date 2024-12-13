import java.util.Scanner;

public class forLoopEx {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 1*1 : 1*12 , 2*1 : 2*12 , 3*1 : 3*12 , ..
//        for (int y =1 ; y <= 12 ; y++){
//            System.out.println(" *********** "  );
//            for (int i =1 ; i <= 12 ; i++){
//            System.out.println(y + " * " + i + " = " + (y*i) );
//
//        }
//        }

        // 1*1 : 1*12 , 2*2 : 2*12 , 3*3 : 3*12 , ...
        for (int y =1 ; y <= 12 ; y++){
            System.out.println(" *********** "  );
            for (int i =y ; i <= 12 ; i++){
                System.out.println(y + " * " + i + " = " + (y*i) );

            }
        }

//        System.out.println( "Enter a number to get the multiplication table" );
//        int num = scanner.nextInt();
//        for (int i =1 ; i <= 12 ; i++){
//            System.out.println( num + " * "+ i + " = " + (num * i ) );
//        }

//        System.out.println( "Enter a number to get the sum to 5" );
//        int sum =0;
//        double avg =0;
//        for ( int i = 1; i <= 5 ; i++){
//
//            System.out.println( "enter the " + i + " number");
//            int x = scanner.nextInt();
//            //sum = sum + x ;
//            sum += x ;
//            avg = sum / i ;
//
//        }
//        System.out.println(" the sum is "+ sum);
//        System.out.println(" the avg is "+ avg );


        // factorial madroop
//        System.out.println( "Enter the number to get factorial of " );
//        int x = scanner.nextInt();
//        int fact = 1;
//        for (int i =1 ; i <= x ; i ++){
//            fact *= i ;
//            }
//        System.out.println( "factorial of " + x + " is " + fact);




    }


}