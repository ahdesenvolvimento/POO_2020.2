package poo_exercicio_08.questao_05;

public class Gerente extends Funcionario {
    private double participacao = 0.05, salario;

    Gerente(double s){
        this.salario = s;
    }
    @Override
    public double getBonificacao(){
        return this.salario + (100000 * participacao) + (this.salario * 0.5);
    }
}
