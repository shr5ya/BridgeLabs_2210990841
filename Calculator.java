import java.util.Scanner;

public class Calculator {


    public void add() {
        int x = 20;
        int y = 30;
        int a = x + y;
        System.out.println("Addition: " + a);
    }

    public void subtract() {
        int x = 20;
        int y = 30;
        int a = x - y;
        System.out.println("Subtraction: " + a);
    }

    public void multiply() {
        int x = 20;
        int y = 30;
        int a = x * y;
        System.out.println("Multiplication: " + a);
    }

    public void division() {
        int x = 20;
        int y = 30;
        int a = x / y;
        System.out.println("Division: " + a);
    }

    public static void main(String[] args) {
        Calculator m = new Calculator();
        m.add();
        m.subtract();
        m.multiply();
        m.division();
    }
}
