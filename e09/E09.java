import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float a = 0f;
        while (true) {

            System.out.println("Give a test score (-1 to quit):");
            float b = scanner.nextFloat();
            if (b == -1) {
                break;
            }
            a += b;
            i += 1;
            float average = a / i;
            System.out.printf("Average: %f", average);
        }
        scanner.close();
    }
}