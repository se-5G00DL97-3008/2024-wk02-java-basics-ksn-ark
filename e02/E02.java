import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int a = scanner.nextInt();
        System.out.println("Give a number:");
        int b = scanner.nextInt();
        scanner.close();
        int plus = a + b;
        int minus = a - b;
        int product = a * b;
        int divide = a / b;
        System.out.println(a + " + " + b + " = " + plus);
        System.out.println(a + " + " + b + " = " + minus);
        System.out.println(a + " + " + b + " = " + product);
        System.out.println(a + " + " + b + " = " + divide);
    }
}