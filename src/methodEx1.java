import java.util.Scanner;

public class methodEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       String name = "mohamed";
//       printName();
//
//        for (int i = 0 ; i < 5 ; i++ )
//            System.out.println("samir");
//
//        printName(name);


        System.out.println("Enter rectangle length");
        int length = scanner.nextInt();
        System.out.println("Enter rectangle width");
        int width = scanner.nextInt();
        rectangleArea(length , width);


    }

    static void printName() {
        for (int i = 0; i < 5; i++)
            System.out.println("ahmed");
    }

    static void printName(String name1) {
        for (int i = 0; i < 5; i++)
            System.out.println(name1);
    }

    static void rectangleArea(int l , int w) {

        int area = l * w;
        System.out.println("Area is " + area);

    }
}

