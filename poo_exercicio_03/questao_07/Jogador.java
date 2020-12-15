package poo_exercicio_03.questao_07;

public class Jogador {
    int forca, nivel, pontos;

    public Jogador(int f, int n, int p){
        this.forca = f;
        this.nivel = n;
        this.pontos = p;
    }

    int calculaAtaque(){
        return this.forca * this.nivel;
    }

    void atacar(Jogador jogador){
        jogador.pontos = jogador.pontos -  this.calculaAtaque();
    }
}
