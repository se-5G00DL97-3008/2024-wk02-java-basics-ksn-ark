import java.util.Scanner;

class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
        scanner.close();
    }
}