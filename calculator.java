public class calculator {

    static int sumIt(int a, int b) {
        return (a + b);
    }

    static int subtrackIt(int a, int b) {
        return (a - b);
    }

    public static void main(String[] args) {
        //   System.out.println("Hello World");
        int firstNum = 50;
        int secondNum = 30;
        int sum = sumIt(firstNum, secondNum);
        System.out.println(sum);
    }
}
