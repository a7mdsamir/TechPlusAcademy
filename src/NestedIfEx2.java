import java.util.Scanner;

public class NestedIfEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double numOfClasses, numOfClassesAttended;
        double percentageOfClassesAttended;


        numOfClasses = 20;
        System.out.println("There are "+numOfClasses+ " Classes ");

        System.out.println("Enter the number of classes Attended");
        numOfClassesAttended = scanner.nextDouble();

        if (numOfClassesAttended >= 0 && numOfClassesAttended <= numOfClasses) {
            percentageOfClassesAttended = (numOfClassesAttended / numOfClasses) * 100;
            System.out.println("percentage Of Classes Attended is " + percentageOfClassesAttended + "%");

            if (percentageOfClassesAttended >= 75) {

                System.out.println(" You are allowed to set in the exam ");
            } else if (percentageOfClassesAttended < 75) {

                System.out.println(" You are not allowed to set in the exam , GET OUT");
            }
        }

        else {
            System.out.println(" Enter the number of classes Attended less than the number of classes ");
        }
        }


        }


