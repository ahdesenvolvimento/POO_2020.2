package poo_exercicio_05.questao_2_5_e_6;

public class Conta {
    private String numero;
    private double saldo;
    Conta(String n, double s){
        this.numero = n;
        this.saldo = s;
    }
    boolean sacar(double valor){
        if (valor > this.saldo){

            return false;
        }
        this.saldo-=valor;
        return true;
    }
    void depositar(double valor){
        this.saldo+=valor;
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
    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }
}
