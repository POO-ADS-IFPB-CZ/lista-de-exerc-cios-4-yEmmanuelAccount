package questao05.model;

public abstract class Personagem {
    // atributos
    public String nome;
    public int vida;

    // constructor
    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // método para ataque
    public abstract void atacar(Personagem alvo);

    public boolean estaVivo() {
        return vida > 0;
    }

    public String toString() {
        return String.format("%s (vida=%d)", nome, vida);
    }
}