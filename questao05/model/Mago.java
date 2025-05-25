package questao05.model;

public class Mago extends Personagem {
    // atributos
    private static final int DANO = 20;
    private static final int CUSTO_MANA = 10;
    private int mana = 50;

    public Mago(String nome) {
        super(nome, 80);
    }

    @Override
    public void atacar(Personagem alvo) {
        if (mana >= CUSTO_MANA) {
            // calculando o resultado de mana restante
            mana -= CUSTO_MANA;

            // mensagem de ataque
            System.out.printf("%s lançou um feitiço em %s, causando %d de dano! (mana restante: %d)\n", nome, alvo.nome, DANO, mana);
            alvo.vida -= DANO;
        
        // mensagem de falha
        } else {
            System.out.printf("%s tentou lançar um feitiço, mas não conseguiu por falta de mana!\n", nome);
        }
    }
}