package poo_exercicio_04.questao_05;

public class Conta {
    String numero;
    double saldo;
    Conta(String n, double s){
        this.numero = n;
        this.saldo = s;
    }
    boolean sacar(double valor){
        if (valor > this.saldo){

            return false;
        }
        saldo-=valor;
        return true;
    }
    void depositar(double valor){
        saldo+=valor;
    }
    double consultarSaldo(){
        return this.saldo;
    }
    boolean transferir(Conta destino, double valor){

        if (sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;

    }
}
