import java.util.Scanner;

public class arrayEx2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int [] array = {2, 6, 8, 5, 7, 3} ;
        int sum = 0 ;


        System.out.println("Enter a number to check "  );
        int x = scanner.nextInt();
        boolean isFound = false ;

        for (int i =0 ; i < array.length ; i++)

            if (x == array[i]){
                System.out.println("Entered number is in the array in the index "  + i  );
                isFound = true ;
            }
            if ( !isFound )
                System.out.println("Entered number is not in the array "  );








    }


}