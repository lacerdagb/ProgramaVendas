import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o faturamento: ");
        double faturamento = scanner.nextDouble();
        double descontoMaior = +(faturamento * 4 / 100);
        double descontoMenor = +(faturamento * 2 / 100);

        if (faturamento >= 10000) {
            System.out.println("================================");
            System.out.printf(String.format(Locale.US, "SUAS VENDAS FORAM DE R$%.2f \n", faturamento));
            System.out.printf(String.format(Locale.US, "SUA COMISSÃO SERÁ DE R$%.2f \n", descontoMaior));
            System.out.println("================================");
        } else if (faturamento <= 10000) {
            System.out.println("================================");
            System.out.printf(String.format(Locale.US, "SUAS VENDAS FORAM DE R$%.2f \n", faturamento));
            System.out.printf(String.format(Locale.US, "SUA COMISSÃO SERÁ DE R$%.2f \n", descontoMenor));
            System.out.println("================================");
        }
        scanner.close();
    }
}
