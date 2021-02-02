package poo_exercicio_08.questao_10_11_e_12;

public class Conta {
    String nome;
    double saldo;

    public Conta(String n, double s) {
        this.nome = n;
        this.saldo = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
