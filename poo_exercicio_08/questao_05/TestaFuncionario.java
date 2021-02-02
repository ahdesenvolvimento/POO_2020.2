package poo_exercicio_08.questao_05;

public class TestaFuncionario {
    public static void main(String[] args) {
        System.out.println("Gerente");
        Gerente g = new Gerente(100);
        System.out.println(g.getBonificacao());

        System.out.println("Diretor");
        Diretor d = new Diretor(100);
        System.out.println(d.getBonificacao());
    }
}
