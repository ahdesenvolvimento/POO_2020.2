package poo_exercicio_04.questao_05;

public class TestaBanco {
    public static void main(String[] args) {
        Conta c = new Conta("1", 100);
        Conta c2 = new Conta("2", 100);
        Banco banco = new Banco(2);
        banco.inserir(c);
        banco.inserir(c2);
        banco.creditar("1", 100);
        banco.exibir();
        banco.transferir("1", "2", 50);
        banco.exibir();
        System.out.println(banco.totalContas());
        System.out.println(banco.totalDinheiro());
        System.out.println(banco.mediaContas());
    }
}
