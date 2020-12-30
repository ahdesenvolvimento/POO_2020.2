package poo_exercicio_04.questao_06;

public class Postagem {
    int id;
    String texto;
    int qtdCurtidas;

    Postagem(int id, String texto){
        this.id = id;
        this.texto = texto;
    }
    void curtir(){
        this.qtdCurtidas++;
    }

    public String toString(){
        return this.texto + Integer.toString(qtdCurtidas);
    }
}
