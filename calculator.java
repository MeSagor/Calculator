import java.util.Scanner;

public class calculator {

    static void addition() {

        int a,b;
        System.out.println("Enter 2 integer number for addition:\n");
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Result = "+(a+b));
    }

    static void subtraction() {

        int a,b;
        System.out.println("Enter 2 integer number for Subtraction:\n");
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    
        System.out.println("Result = "+(a-b));
    }
    
    static void division(){

       int a,b;
        System.out.println("Enter 2 integer number for Division:\n");
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt(); 
        
        System.out.println("Result = "+(a/b));
        // please add try-catch because if b = 0, the program will crash.
    }
    static void multiplicatoin()
    {
        int a,b;
        System.out.println("Enter 2 integer number for addition:\n");
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Result = "+(a*b));

    }
    public static void main(String[] args) {
        //   System.out.println("Hello World");


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Your Choice: ");

            System.out.println("'1' for Addition");
            System.out.println("'2' for Subtraction");
            System.out.println("'3' for Multiplication");
            System.out.println("'4' for Division");
            System.out.println("'0' for exit");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    addition();                
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplicatoin();
                    break;
                case 4:
                    division();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
        
    }
}
