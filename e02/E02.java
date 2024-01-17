import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int a = scanner.nextInt();
        System.out.println(a);
        System.out.println("Give another number:");
        int b = scanner.nextInt();
        System.out.println(b);
        scanner.close();
        System.out.printf("%d + %d = %d\r\n", a, b, a + b);
        System.out.printf("%d - %d = %d\r\n", a, b, a - b);
        System.out.printf("%d * %d = %d\r\n", a, b, a * b);
        System.out.printf("%d / %d = %d", a, b, a / b);
    }
}