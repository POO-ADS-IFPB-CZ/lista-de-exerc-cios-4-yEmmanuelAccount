package questao05.model;

public class Arqueiro extends Personagem {
    // tributos
    private static final int DANO = 12;
    private int flechas = 5;

    public Arqueiro(String nome) {
        super(nome, 90);
    }

    // método de ataque
    @Override
    public void atacar(Personagem alvo) {
        if (flechas > 0) {
            // diminuindo o número restante de flechas
            flechas--;

            // exibindo mensagem de uso
            System.out.printf("%s disparou uma flecha em %s, causando %d de dano! (flechas restantes: %d)\n", nome, alvo.nome, DANO, flechas);

            // atualizando a vida do alvo após o ataque
            alvo.vida -= DANO;
        
        // mensagem de falha
        } else {
            System.out.printf("%s tentou atacar, mas está sem flechas e o ataque foi mal sucedido!\n", nome);
        }
    }
}