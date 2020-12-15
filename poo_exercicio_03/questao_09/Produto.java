package poo_exercicio_03.questao_09;

public class Produto {
    int codigo, quantidade, quantidadeMinima;
    double valor;
    String descricao;

    public Produto(int c, int q, double v, String d, int qm){
        this.codigo = c;
        this.quantidade = q;
        this.valor = v;
        this.descricao = d;
        this.quantidadeMinima = qm;
    }
    public void baixar(int q){
        int operacao = this.quantidade - q;
        System.out.println(operacao);
        if (operacao < quantidadeMinima){
            this.quantidade = q + operacao;
            System.out.println("Impossível realizar operação!");
        }else {
            this.quantidade-= q;
        }
    }

    public void repor(int q){
        this.quantidade+= q;
    }
    public void reajustar(double taxa){
        this.valor = this.valor + (this.valor * (taxa/100));
    }

    public String toString(){
        return Integer.toString(this.codigo) + Double.toString(this.valor) + this.descricao + Integer.toString(this.quantidade);
    }

    boolean equals(Produto produto){
        if (this.codigo == produto.codigo){
            return true;
        }
        return false;

    }
}
