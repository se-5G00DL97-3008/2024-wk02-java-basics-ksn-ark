import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Give a number (0 to quit):");
            int a = scanner.nextInt();
            if (a == 0) {
                break;
            }
            if (a % 2 == 0) {
                System.out.println("Number is odd");
            } else {
                System.out.println("Number is even");
            }
        }
        scanner.close();
    }
}