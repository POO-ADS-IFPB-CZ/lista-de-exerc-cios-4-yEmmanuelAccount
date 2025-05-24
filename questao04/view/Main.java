package questao04.view;

import questao04.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor a pagar: R$ ");
        double valor = scanner.nextDouble();

        // Criamos um array de Pagamento, usando polimorfismo
        Pagamento[] formas = {
            new CartaoCredito(),
            new Boleto(),
            new Pix()
        };

        System.out.println("\nProcessando pagamentos:");
        for (Pagamento forma : formas) {
            forma.processar(valor);
        }

        scanner.close();
    }
}