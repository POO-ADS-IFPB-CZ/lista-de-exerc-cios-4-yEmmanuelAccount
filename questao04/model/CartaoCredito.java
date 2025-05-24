package questao04.model;

public class CartaoCredito extends Pagamento {
    // regra específica para o Cartão de Crédito
    private static final double TAXA = 0.1; // 10%

    @Override
    public double processar(double valor) {
        // calculando
        double valorFinal = valor * (1 + TAXA);

        // imprimindo resultado
        System.out.printf("\nCartão de Crédito\n > Valor original: %.2f \n > Valor Final: %.2f (+10%%)\n", valor, valorFinal);

        // retornando valor final
        return valorFinal;
    }
}
