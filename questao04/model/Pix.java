package questao04.model;

public class Pix extends Pagamento {
    // regra específica para o PIX
    private static final double DESCONTO = 0.95; // 5%

    @Override
    public double processar(double valor) {
        // calculando
        double valorFinal = valor * DESCONTO;

        // imprimindo resultado
        System.out.printf("\nPIX\n > Valor original: %.2f \n > Valor Final: %.2f (-5%%)\n", valor, valorFinal);

        // retornando valor final
        return valorFinal;
    }
}
