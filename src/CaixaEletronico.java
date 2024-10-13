

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        if (valor < 0 || valor % 2 != 0) {
            System.out.println("Valor Invalido");
        } else {
            int notasDe50 = valor / 50;
            valor %= 50;
            int notasDe10 = valor / 10;
            valor %= 10;
            int notasDe2 = valor / 2;

            System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2%n", notasDe50, notasDe10, notasDe2);
        }

        scanner.close();
    }
}
