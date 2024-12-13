import java.util.Scanner;

public class proj1ATM {
    static String[] names = {"ahmed samir", "reem elnaggar", "hussein", "mahmoud"};
    static int[] pinCode = {2468, 1234, 9999, 4444};
    static int[] balance = {0, 50000, 9764, 2565};
    static String currentName ;
    static int currentPinCode;
    static int currentBalance = -1;
    static int currentIndex ;

    public static void main(String[] args) {

        initialScreen();

        }

static void initialScreen(){
    Scanner scanner = new Scanner(System.in);
    System.out.println(" ****************************** ");
    System.out.println(" Please enter the secret number ");
    currentPinCode = scanner.nextInt();
    System.out.println(" ****************************** ");

    for(int i =0; i < pinCode.length; i++)
    {
        if(currentPinCode == pinCode[i])
        {
            currentName = names[i] ;
            currentBalance = balance[i] ;
            currentIndex = i;
            selectScreen();
        }
    }
    if(currentBalance == -1)
    errorScreen();
}
    static void errorScreen(){
        System.out.println(" ****************************** ");
        System.out.println("              Error             ");
        System.out.println(" ****************************** ");
        initialScreen();
    }
    static void selectScreen(){
        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        System.out.println(" ****************************** ");
        System.out.println("       Welcome             " + currentName);
        //System.out.println("       Your balance is     " + currentBalance);
        System.out.println("       Please select an operation: ");
        System.out.println(" 1- cash withdraw      4- bill     ");
        System.out.println(" 2- balance inquiry    5- setting  ");
        System.out.println(" 3- transfer           6- donate   ");
        System.out.println(" ****************************** ");
        operation = scanner.nextInt();

        if(operation == 1)
            cashWithdraw();
        else if (operation == 2) {
            balanceInquiry();
        } else if (operation == 3) {
            transfer();
        } else if (operation == 4) {
            bill();
        } else if (operation == 5) {
            setting();
        } else if (operation == 6) {
            donate();
        }
        else{
            System.out.println(" You enter a wrong choice");
            errorScreen();
        }
    }
    static void cashWithdraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ****************************** ");
        System.out.println(" Please enter the amount  ");
        int amount = scanner.nextInt();
        System.out.println(" ****************************** ");
        if (currentBalance >= amount){
            System.out.println(" trtrrrrrrrrrrrrrrrrrr ");
            currentBalance -= amount ;
            balance[currentIndex] -= amount;
            balanceInquiry();
        }
        else
            errorScreen();
    }
    static void balanceInquiry(){
        System.out.println(" ****************************** ");
        System.out.println("       Welcome             " + currentName);
        System.out.println("       Your balance is     " + currentBalance);
        selectScreen();
    }
    static void transfer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ****************************** ");
        System.out.println(" Please enter the amount  ");
        int amount = scanner.nextInt();
        System.out.println(" Please enter the name to transfer  ");
        String n = scanner.next();
        System.out.println(" ****************************** ");
        if (currentBalance >= amount){
            for (int j =0; j< names.length ; j++)
                if (n.equals(names[j]))
                    balance[j] += amount;
            
            currentBalance -= amount ;
            balance[currentIndex] -= amount;
            balanceInquiry();
        }
        else
            errorScreen();
    }

    static void bill(){}
    static void setting(){}
    static void donate(){}

    }