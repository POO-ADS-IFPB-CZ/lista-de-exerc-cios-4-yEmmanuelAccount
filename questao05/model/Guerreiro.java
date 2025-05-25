package questao05.model;

public class Guerreiro extends Personagem {
    // atributos
    private static final int DANO = 15;


    public Guerreiro(String nome) {
        super(nome, 100);
    }

    @Override
    public void atacar(Personagem alvo) {
        // exibindo mensagem
        System.out.printf("%s usa sua espada contra %s, causando %d de dano!\n",nome, alvo.nome, DANO);

        // subtraindo o DANO da VIDA
        alvo.vida -= DANO;
    }
}