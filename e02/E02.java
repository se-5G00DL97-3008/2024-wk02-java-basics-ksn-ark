import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int a = scanner.nextInt();
        System.out.println("Give another number:");
        int b = scanner.nextInt();
        scanner.close();
        System.out.printf("%d\r\n", a + b);
        System.out.printf("%d\r\n", a - b);
        System.out.printf("%d\r\n", a * b);
        System.out.printf("%d", a / b);
    }
}