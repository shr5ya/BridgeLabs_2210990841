import java.util.Scanner;

public class CalculatorScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int input = sc.nextInt();

        System.out.println("enter second number");
        int b= sc.nextInt();

        int result = a+b;
        sc.close();
    }
}