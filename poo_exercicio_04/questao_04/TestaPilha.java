package poo_exercicio_04.questao_04;

public class TestaPilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.empilhar(5);
        p.exibir();
        p.empilhar(7);
        System.out.println(p.retornarTopo());
        System.out.println("------------");
        p.desempilhar();
        p.exibir();
        System.out.println(p.retornarTopo());
    }
}
