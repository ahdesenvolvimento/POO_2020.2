package poo_exercicio_03.questao_07;

import poo_exercicio_03.questao_07.Jogador;

public class TestaJogador {
    public static void main(String[] args) {
        Jogador j1 = new Jogador(10, 10, 1000);
        Jogador j2 = new Jogador(10, 10, 1010);

        j1.atacar(j2);
        System.out.println(j2.pontos);
    }
}
