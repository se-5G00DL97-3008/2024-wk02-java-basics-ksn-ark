import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int a = 0;
        while (true) {

            System.out.println("Give a test score (-1 to quit):");
            int b = scanner.nextInt();
            if (b == -1) {
                break;
            }
            a += b;
            i += 1;
            System.out.printf("Average: %f", Float.parseFloat(a / i));
        }
        scanner.close();
    }
}