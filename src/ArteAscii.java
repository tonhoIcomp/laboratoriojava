import java.util.Scanner;

public class ArteAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        scanner.close();
    }
}
