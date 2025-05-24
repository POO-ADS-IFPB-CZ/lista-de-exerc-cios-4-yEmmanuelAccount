package questao04.model;

public class Boleto extends Pagamento {
    // regra específica para o Boleto
    private static final double TAXA = 0.05; // 5%

    @Override
    public double processar(double valor) {
        // calculando
        double valorFinal = valor * (1 + TAXA);

        // imprimindo resultado
        System.out.printf("\nBoleto\n > Valor original: %.2f \n > Valor Final: %.2f (+5%%)\n", valor, valorFinal);

        // retornando valor final
        return valorFinal;
    }
}
