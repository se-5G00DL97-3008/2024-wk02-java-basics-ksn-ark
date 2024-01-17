import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int a = scanner.nextInt();
        System.out.println("Until which multiplier should the table show?");
        int b = scanner.nextInt();
        scanner.close();
        for (int i = 0; i <= b; i++) {
            System.out.printf("%d x %d = %d%n", i, a, a * i);
        }
    }
}