import java.util.Scanner;

public class DataExtenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataStr = scanner.next();

        int dia = Integer.parseInt(dataStr.substring(0, 2));
        int mes = Integer.parseInt(dataStr.substring(2, 4));
        int ano = Integer.parseInt(dataStr.substring(4, 8));

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", 
                          "agosto", "setembro", "outubro", "novembro", "dezembro"};
        String nomeMes = meses[mes - 1];

        System.out.printf("%d de %s de %d%n", dia, nomeMes, ano);

        scanner.close();
    }
}
