package poo_exercicio_08.questao_10_11_e_12;

public class ContaCorrente extends Conta implements Tributavel {

    ContaCorrente(String n, double s){
        super(n, s);
    }
    public double calculoTributos(){
        return this.saldo * 0.1;
    }

}
