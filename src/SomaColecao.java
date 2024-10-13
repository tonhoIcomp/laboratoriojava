import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int valor;

        while (true) {
            valor = scanner.nextInt();
            if (valor == -1) {
                break; 
            }
            soma += valor;
        }

        System.out.println(soma);

        scanner.close();
    }
}
