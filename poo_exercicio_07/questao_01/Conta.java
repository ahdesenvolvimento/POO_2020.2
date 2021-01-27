package poo_exercicio_07.questao_01;

public class Conta {
    private String numero;
    private double saldo;
    Conta(String n, double s){
        this.numero = n;
        this.depositar(s);
    }
    void sacar(double valor){
        this.validarValor(valor);
        this.saldo-=valor;
    }
    void depositar(double valor){
        this.validarValor(valor);
        this.saldo+=valor;
    }

    double consultarSaldo(){
        return this.saldo;
    }
    void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
    }
    private void validarValor(double valor){
        if (valor <= 0){
            throw new AplicacaoException("Valor inválido");
        }else{
            if (this.saldo != 0.0){
                if (valor > this.saldo){
                    throw new AplicacaoException("Valor de saque precisa ser menor ou igual ao valor do saldo");
                }
            }
        }

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
