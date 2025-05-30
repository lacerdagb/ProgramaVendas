import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o faturamento: ");
        double faturamento = scanner.nextDouble();
        double descontoMaior = +(faturamento * 4 / 100);
        double descontoMenor = +(faturamento * 2 / 100);
        double boneficacao = 10000;

        if (faturamento >= boneficacao) {   
            System.out.println("================================");
            System.out.printf("SUAS VENDAS FORAM DE R$%.2f \n", faturamento);
            System.out.printf("SUA COMISSÃO SERÁ DE R$%.2f \n", descontoMaior);
            System.out.println("================================");
        } else if (faturamento <= boneficacao) {
            System.out.println("================================");
            System.out.printf("SUAS VENDAS FORAM DE R$%.2f \n", faturamento);
            System.out.printf("SUA COMISSÃO SERÁ DE R$%.2f \n", descontoMenor);
            System.out.println("================================");
        }
        scanner.close();
    }
}
/*
 * double comissao = 0 
 * 
 * if() {
 * comissao = faturamento * 0.04  <----- 4%
 * }
 */
