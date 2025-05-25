package questao05.view;

import questao05.model.*;

public class Main {
    public static void main(String[] args) {
        Personagem[] party = {
            new Guerreiro("Emanuel"),
            new Mago("Will"),
            new Arqueiro("Maria Clara")
        };

        Personagem inimigo = new Personagem("Ogro", 300) {
            @Override
            public void atacar(Personagem alvo) {
                // ataque do inimigo
                int dano = 10;
                System.out.printf("%s ataca %s, causando %d de dano!%n", nome, alvo.nome, dano);
                alvo.vida -= dano;
            }
        };

        System.out.println("=== Início do Combate ===");
        // Simula um turno: cada personagem ataca o inimigo e ele revida
        for (Personagem p : party) {
            if (p.estaVivo()) {
                p.atacar(inimigo);
            }
        }

        if (inimigo.estaVivo()) {
            System.out.println("\nOgro contra-ataca!");
            for (Personagem p : party) {
                if (p.estaVivo()) {
                    inimigo.atacar(p);
                }
            }
        }

        System.out.println("\nEstado Final \n  > ");
        System.out.println(inimigo);
        for (Personagem p : party) {
            System.out.println(p);
        }
    }
}