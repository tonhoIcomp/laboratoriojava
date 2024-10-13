
import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double alturaAr = scanner.nextDouble();

        int opcao = scanner.nextInt();

        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        double volumeCalota = Math.PI * Math.pow(alturaAr, 2) * (3 * raio - alturaAr) / 3;

        if (opcao == 1) {
            System.out.printf("%.4f%n", volumeCalota); // Volume de ar
        } else if (opcao == 2) {
            double volumeCombustivel = volumeEsfera - volumeCalota; // Volume de combustível
            System.out.printf("%.4f%n", volumeCombustivel);
        }

        scanner.close();
    }
}
