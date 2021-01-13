package poo_exercicio_06.questao_02_e_questao_03;

public class Produto {
    int id, quantidade;
    String descricao;
    double valor;
    Produto(int x, String desc, double y, int qnt){
        this.id = x;
        this.descricao = desc;
        this.valor = y;
        this.quantidade = qnt;
    }
    void repor(int quantidade){
        this.quantidade+=quantidade;
    }
    void darBaixa(int quantidade){
        this.quantidade-=quantidade;
    }
}
