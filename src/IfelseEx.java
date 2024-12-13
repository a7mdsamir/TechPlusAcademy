import java.util.Scanner;

public class IfelseEx {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

double x,y , area;
        double degree;

        System.out.println("Enter your grade");
        degree = scanner.nextDouble();

        if (degree <= 100 && degree > 84){
            System.out.println("your entered grade is! " + degree + " and your grade is A");
        }
        else if (degree <= 84 && degree > 69){
            System.out.println("your entered grade is! " + degree + " and your grade is B");
        }
        else if (degree <= 69 && degree > 59){
            System.out.println("your entered grade is! " + degree + " and your grade is C");
        }
        else if (degree <=59 && degree > 49){
            System.out.println("your entered grade is! " + degree + " and your grade is D");
        }
        else if (degree <=49 && degree > 0){
            System.out.println("your entered grade is! " + degree + " and your grade is D");
        }
        else {
            System.out.println("your entered grade must be between 0 and 100");
        }

    }


}