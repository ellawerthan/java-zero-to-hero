package ee.itcollage.level2;

public class Multiplication {

    public static int multiply(int x1, int x2) {
        return x1 * x2;
    }

    public static void main(String[] args) {
        //todo create function in this class that multiplies 2 inputs
        // call the function in the main method, for example with 5x4... should be 20
        int result = multiply(5, 4);
        System.out.printf("5 times 4 is %d", result);
    }
}
