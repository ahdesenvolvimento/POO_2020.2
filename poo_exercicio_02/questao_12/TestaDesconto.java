package poo_exercicio_02.questao_12;

public class TestaDesconto {
    public static void main(String[] args) {
        Desconto d = new Desconto();
        d.valorOriginal = 120;
        d.desconto = 10;
        System.out.println(d.calcular());
    }
}
