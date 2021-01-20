package poo_exercicio_05.questao_04;

public class TestaContaImposto {
    public static void main(String[] args) {
        ContaImposto c = new ContaImposto(500, 2);
        c.creditar(1000);
        System.out.println("Saldo: " + c.getSaldo());
        c.debitar(1000);
        System.out.println("Saldo: " + c.getSaldo());
    }
}
