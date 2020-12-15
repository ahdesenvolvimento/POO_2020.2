package poo_exercicio_03.questao_09;

public class TestaProduto {
    public static void main(String[] args) {
        Produto p = new Produto(1, 10, 100, "Ops", 5);
        Produto p2 = new Produto(1, 100, 100, "Ops12412412", 50);
        System.out.println(p.quantidade);
        p.baixar(6);
        System.out.println(p.quantidade);
        System.out.println(p.valor);
        p.reajustar(150);
        System.out.println(p.valor);

        System.out.println(p.toString());
        if (p.equals(p2)){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }
}
