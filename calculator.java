public class calculator {

    static int sumIt(int a, int b) {
        return (a + b);
    }

    static int subtrackIt(int a, int b) {
        return (a - b);
    }
    
    static int division(int a, int b){
        return a/b;
        // please add try-catch because if b = 0, the program will crash.
    }

    public static void main(String[] args) {
        //   System.out.println("Hello World");
        int firstNum = 50;
        int secondNum = 30;
        int sum = sumIt(firstNum, secondNum);
        System.out.println(sum);
    }
}
