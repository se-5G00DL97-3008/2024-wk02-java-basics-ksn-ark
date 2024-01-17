import java.util.Scanner;

class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int a = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d%n", a, i, a * i);
        }
    }
}