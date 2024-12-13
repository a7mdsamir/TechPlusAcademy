import java.util.Scanner;

public class NestedIfEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double num1, num2, num3;
        char operation;

//        System.out.println("Enter the required operation from ( + - * / )");
//        operation = scanner.next().charAt(0);

        System.out.println("Enter the first num");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second num");
        num2 = scanner.nextDouble();
        System.out.println("Enter the third num");
        num3 = scanner.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {

                System.out.println(" num1 " + num1 + " > num2 " + num2 + " > num3 " + num3);
            }
                else{
                        System.out.println(" num1 " + num1 + " > num3 " + num3 + " > num2 " + num2);

                }
            }


         else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {

                System.out.println(" num2 " + num2 + " > num1 " + num1 + " > num3 " + num3);
            }
            else{
                System.out.println(" num2 " + num2 + " > num3 " + num3 + " > num1 " + num1);

            }
        }

        else if (num3 >= num1 && num3 >= num2) {
            if (num1 >= num2) {

                System.out.println(" num3 " + num3 + " > num1 " + num1 + " > num2 " + num2);
            }
            else{
                System.out.println(" num3 " + num3 + " > num2 " + num2 + " > num1 " + num1);

            }
        }
        else {
            System.out.println(" num3 ");
        }
        }


        }


