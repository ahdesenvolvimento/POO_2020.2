package poo_exercicio_03.questao_06_e_questao_08;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("1",100);
        Conta c2 = new Conta("2",100);
        if (c1.sacar(20)){
            System.out.println("Valor sacado!");
        }else{
            System.out.println("Impossível realizar operação");
        }
        if (c1.transferir(c2, 50)){
            System.out.println("Valor transferido");
        }else{
            System.out.println("Impossivel transferir valor");
        }

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
    /*a) Resultado é 90 90, pois o c1 perdeu a referencia e apontou para c2, logo qualquer operação em c1 iria afetar c2 e virse versa
    * b) A referencia é perdida*/
}
