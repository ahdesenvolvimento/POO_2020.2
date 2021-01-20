package poo_exercicio_05.questao_04;

public class ContaImposto {
    private double saldo;
    private int numero;

    ContaImposto(double x, int y){
        this.saldo = x;
        this.numero = y;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void creditar(double valor){
        this.saldo+=valor;
    }

    public void debitar(double valor){
        double x = this.retemImposto(valor);
        this.saldo-=x;
    }
    private double retemImposto(double valorDebito){
        return valorDebito - (valorDebito * (0.38));
    }
}
