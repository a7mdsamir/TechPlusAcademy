import java.util.Scanner;

public class methodEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter rectangle length");
        int length = scanner.nextInt();
        System.out.println("Enter rectangle width");
        int width = scanner.nextInt();
        int area = rectangleArea(length , width);
        System.out.println("Area is " + area);

        int m = max(length , width);
        System.out.println("Max num is " + m);


    }


    static int rectangleArea(int l , int w) {

        int area = l * w;
        return area ;
    }
    static int max (int l , int w) {
        if (l > w)
        return l ;
        else
            return w;

    }
}

